#!/bin/bash
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



version=`mvn -o org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | grep -v '\['`
JAR="target/toop-simulator-ng-${version}-bundle.jar"
if [[ ! -r $JAR ]]
then
  mvn verify
else
  echo "$JAR exists"
fi


export SIM_MODE=SOLE
#DC_PORT=8080
#DP_PORT=8082
#DC_URL="http://localhost:8080/to-dc"
#DP_URL="http://localhost:8082/to-dp"
#CONNECTOR_PORT=8081

java -jar $JAR
