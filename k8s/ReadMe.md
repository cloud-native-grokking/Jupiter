# How to deploy to k8s:

Jupiter service are using 2 external stateful service:
- MongoDB
- Kafka

So firstly, we need to install those service. The simplest way to do this is using kubernetes operator or helm. I'll use helm.

## Step-by-step install:
1. Install helm to your k8s cluster
2. [Install kafka using helm](https://github.com/bitnami/charts/tree/master/bitnami/kafka) by using `helm install jupiter-kafka bitnami/kafka --set volumePermissions.enabled=true,service.clusterIP=jupiter-kafka`
3.  [Install MongoDB using helm](https://github.com/helm/charts/tree/master/stable/mongodb) by using `helm install jupiter-mongodb bitnami/mongodb --set volumePermissions.enabled=true,service.name=jupiter-mongodb`
4. `kubectl apply -f .` and you're ready to rock

## To removve:
1. `helm delete jupiter-kafka`
2. `helm delete jupiter-mongodb`
3. `kubectl delete -f .`

The complete helm version of jupiter service are comming soon