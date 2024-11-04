package com.rong.service.customer.k8s;


import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.revwalk.RevCommit;

import java.io.File;
import java.io.IOException;

public class GitConfigReader {

    private final String repoUrl;
    private final String branch;

    public GitConfigReader(String repoUrl, String branch) {
        this.repoUrl = repoUrl;
        this.branch = branch;
    }

    public File cloneRepository(String localPath) throws GitAPIException {
        return Git.cloneRepository()
                .setURI(repoUrl)
                .setBranch(branch)
                .setDirectory(new File(localPath))
                .call()
                .getRepository()
                .getDirectory();
    }

    public String getLatestCommitMessage() throws IOException {
        try (Git git = Git.open(new File("path/to/local/repo/.git"))) {
            RevCommit latestCommit = git.log().setMaxCount(1).call().iterator().next();
            return latestCommit.getFullMessage();
        }
    }
}
