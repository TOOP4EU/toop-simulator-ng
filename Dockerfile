#
# This work is protected under copyrights held by the members of the
# TOOP Project Consortium as indicated at
# http://wiki.ds.unipi.gr/display/TOOP/Contributors
# (c) 2018-2021. All rights reserved.
#
# This work is licensed under the EUPL 1.2.
#
#  = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
#
# Licensed under the EUPL, Version 1.2 or – as soon they will be approved
# by the European Commission - subsequent versions of the EUPL
# (the "Licence");
# You may not use this work except in compliance with the Licence.
# You may obtain a copy of the Licence at:
#
#         https://joinup.ec.europa.eu/software/page/eupl
#

FROM tomcat:9-jdk11

ARG VERSION="2.1.1"
ARG JAR_NAME=toop-simulator-ng-${VERSION}-bundle.jar

#create tc webapp folder
WORKDIR /simulator

ENV JAVA_OPTS="$JAVA_OPTS -Djava.security.egd=file:/dev/urandom" \
    JAR_NAME="${JAR_NAME}"

ADD ./target/${JAR_NAME} ./


CMD ["sh", "-c", "java $JAVA_OPTS -jar ${JAR_NAME}"]
