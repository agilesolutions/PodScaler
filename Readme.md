
# POD operator to scaling pod's configured on git manitfests

write kubernetes controller with java kubernetes client api to read yaml config from git with jgit
to scaling pods, build with gradle and provide helm chart and package and publish to helm repository


. gradle init --type java-application
. helm create git-config-pod-scaler
. helm package git-config-pod-scaler
. helm repo index ./ --url http://your-helm-repo-url