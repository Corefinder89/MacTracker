# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

MAINTAINER corefinder@docker.com

# Update ubuntu system
RUN apt-get update

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install nmap in the container
RUN apt-get install -y nmap

# Install git on ubuntu-image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://8702726a016fa4f7ffa6a105c1595078c11b8c1c:x-oauth-basic@github.com/SoumyajitBasu1988/MacTracker.git

# Navigate to the working directory and change file permission to execute shell scripts
WORKDIR MacTracker
WORKDIR tracker_execute
RUN chmod +x Extractor.sh
RUN chmod +x run_nmap.sh
WORKDIR "/MacTracker"
RUN chmod +x task_runner.sh

CMD ["./task_runner.sh"]

ENTRYPOINT ["/bin/bash"]
