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
    An image is an executable package that includes everything needed to run an application--the code, a runtime, libraries, environment variables, and configuration files.
    Often one images will based on another image with some additional customizations.
    We can create our own image by creation Dockerfile with steps to create container.

Containers:
    containers are the runnable instance of an image. 


 Namespaces
 control groups -- docker uses linux cgroups to allocate needfull resources to conatiners 
 union file systems
 container format.


