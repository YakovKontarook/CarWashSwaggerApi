export PACKAGE_NAME=CarWashSwaggerApi
export GROUP_ID=ru
export ARTIFACT_ID=api
export CI_BUILD_TAG=0.0.1

java -DmodelTests=false -DapiTests=false -jar swagger-codegen-cli-*.jar generate \
        -i /Users/kontarook/IdeaProjects/kontarook/CarWashSwaggerApi/carwash-doc.json \
        -l java \
        --library resttemplate \
        --invoker-package ${PACKAGE_NAME}.api.invoker \
        --model-package ${PACKAGE_NAME}.api.model \
        --api-package ${PACKAGE_NAME}.api.controller \
        --group-id $GROUP_ID \
        --artifact-id $ARTIFACT_ID \
        --artifact-version $CI_BUILD_TAG \
        -o target/gen-swagger-api --additional-properties dateLibrary=java8-localdatetime,java8=true