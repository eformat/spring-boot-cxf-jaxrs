FROM redhat-openjdk-18/openjdk18-openshift:latest

ENV APM_VERSION=0.13.0.Final
ENV APM_AGENT=/libs/hawkular-apm-agent.jar

ADD https://repository.jboss.org/nexus/service/local/artifact/maven/redirect?r=releases&g=org.hawkular.apm&a=hawkular-apm-agent&v=$APM_VERSION&e=jar $APM_AGENT

# Temporary switch to root
USER root

RUN chmod 444 /libs/hawkular-apm-agent.jar

# S2I requires a numeric, non-0 UID. This is the UID for the jboss user in the base image
USER 185
