## SpringBootWarFileDevOps

A Spring Boot .WAR based application deployed via Azure DevOps pipelines to a context under Tomcat that isn't the 'ROOT' folder. This shows how to deploy to a differently named context.

The task being used is [Azure App Service Deploy](https://github.com/microsoft/azure-pipelines-tasks/blob/master/Tasks/AzureRmWebAppDeploymentV4/README.md#deployment) - specifically with the `customDeployFolder` property which is what lets us deploy to a folder that is not `ROOT` - which lets us access the `.war` under any arbitrary path context.

For example, if `customDeployFolder` is set to `foo` the `.war` can be accessed by navigating to 'myappservice.azurewebsites.net/foo'.
