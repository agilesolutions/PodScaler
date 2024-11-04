package com.rong.service.customer.k8s;

public class App {

    public static void main(String[] args) {
        try {
            GitConfigReader gitReader = new GitConfigReader("https://github.com/user/repo.git", "main");
            gitReader.cloneRepository("local/repo");

            K8sController controller = new K8sController();
            // Example: scale the deployment to 3 replicas
            controller.scaleDeployment("default", "my-deployment", 3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
