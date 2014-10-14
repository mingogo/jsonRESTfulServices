Exception:
	Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: Only one JAX-RS Application Class allowed.
Cause:
	While googling on the net , found that JBoss comes with its own
	implementation  for JAX RS (Resteasy). Also, found that JIRA is already
	opened for JBoss AS6 (https://issues.jboss.org/browse/JBAS-8830)
Solution:
In the web.xml, add the following:

	<context-param>
			<param-name>resteasy.scan</param-name>
			<param-value>false</param-value>
	</context-param>

	<context-param>
			<param-name>resteasy.scan.resources</param-name>
			<param-value>false</param-value>
	</context-param>

	<context-param>
			<param-name>resteasy.scan.providers</param-name>
			<param-value>false</param-value>
	</context-param>

	and comment out the following init param
	<!--
		<init-param>	
			<param-name>com.sun.jersey.config.property.packages</param-name>
			<param-value>org.abcd.abcd.</param-value>
		</init-param>	

	-->
