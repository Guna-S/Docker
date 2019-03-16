# Docker


Docker is working based on the server clint model.
Docker uses host machine operation system unlike other VM's which is why docker is lightweight
and fast.


Docker Engine:

   1. Docker deamon
   2. Dokcer REST 
   3. Docker CLI


 Dokcer Architecture:

      Docker deamon which manages (running,removing) docker objects such as containers,images,volums
      Docker clint issues command to docker deamon to create,stop or delete containers.
          ex: docker pull openjdk
          ex: docker run oprnjdk


     Docker deamon and docker clint can run on same meachine or docker client can connect to
     remote docker deamon to manage applications.

    Docker registry where all the images stored. 

Images:
     Images are binary format file which contains the steps to create conatiners with configuarions.
     Often one images will based on another image with some additional customizations.

     we can create our own image by creation Dockerfile with steps to create container.

Containers:
    containers are the runnable instance of an image. 


 Namespaces
 control groups
 union file systems
 container format.
 
     
