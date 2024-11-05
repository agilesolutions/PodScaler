package com.agilesolutions.k8s;

import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientException;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class PodScalerController {
    private final KubernetesClient client;

    public PodScalerController(KubernetesClient client) {
        this.client = client;
    }

    public void scalePodFromYaml(String yamlFilePath) throws Exception {
        try (InputStream inputStream = Files.newInputStream(Paths.get(yamlFilePath))) {
            Yaml yaml = new Yaml();
            Map<String, Object> config = yaml.load(inputStream);

            String podName = (String) config.get("podName");
            int replicas = (int) config.get("replicas");

            PodList podList = client.pods().list();
            podList.getItems().stream()
                    .filter(pod -> pod.getMetadata().getName().equals(podName))
                    .forEach(pod -> {
                        try {
                            // Logic to scale the pod, e.g., update Deployment or StatefulSet
                            // You may need to implement the scaling logic based on your specific use case
                        } catch (KubernetesClientException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
