FROM jenkins/jenkins:2.249.3-lts-centos7
ENV   CLIENTID CLIENTID
ENV   CLIENTSECRET CLIENTSECRET
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ENV CASC_JENKINS_CONFIG /var/jenkins_home/casc.yaml
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
COPY casc /var/jenkins_home/casc.yaml
COPY config /usr/share/jenkins/ref/config/