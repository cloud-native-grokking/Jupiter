This demo use NFS server to act as a persistent storage outside of you kubernetes cluster. We can setup a NFS server on you machine use docker:

`docker run -d --name nfs --privileged -v $(pwd)/nfsshare:/nfsshare -e SHARED_DIRECTORY=/nfsshare -p 2049:2049 itsthenetwork/nfs-server-alpine:latest`

After NFS server is up replace `<YOUR-MACHINE-IP-ADDRESS>` in file `database-pv.yaml` to your machine's IP address