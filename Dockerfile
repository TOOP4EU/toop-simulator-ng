#
# Copyright 2021 - TOOP Project
#
# This file and its contents are licensed under the EUPL, Version 1.2
# or – as soon they will be approved by the European Commission – subsequent
# versions of the EUPL (the "Licence");
#
# You may not use this work except in compliance with the Licence.
# You may obtain a copy of the Licence at:
#
#       https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
#
# Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#
# See the Licence for the specific language governing permissions and limitations under the Licence.
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
