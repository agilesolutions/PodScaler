
# POD operator to scaling pod's based on desired state configured on YAML manifest external managed on git repo.

This setup provides a basic structure for a Kubernetes controller using Java that scales pods based on a YAML configuration from an external Git repository, along with a Helm chart, Dockerfile, Gradle build script, and a Jenkins pipeline. Adjust paths and parameters according to your specific environment and needs.


my-controller/
├── Chart.yaml
├── values.yaml
└── templates/
├── deployment.yaml
├── service.yaml
