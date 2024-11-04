
# Customer K8S service

## Flyway and build
* gradle bootRun 
* http://localhost:8080/customers
* gradle copyDockerFile
* gradle generateHelmChart


## Kubectl

* kubectl logs -f -l xxx -n myspace
* kubectl rollout restart deploy mydeployment -n myspace
* kubectl scale deploy mydeploy --replicas=0 -n myspace
* kubectl logs --tail=300 -l xxx -n myspace -c init
* kubectl port-forward pods/xxx 8080:8080 -n xxx

## az
* az account get-access-token -- resource api://my.com -o tsv --query accessToken
* az login
* az account set -s "xxx"
* az aks list -o table
* az acr login -n xxx
* az acr helm repo add -n xxx





## helm

* helm search repo xxx
* helm show values xxx/xxx
* helm show chart xxx/xxx
* helm template . --name-template=customer-service
 