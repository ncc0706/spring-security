# spring-security

这里用的是Spring Security4

## Spring Security4 默认的的登录页面

form表单参数:

	action: /login
	method: /POST
	
	name="username"
	name="password"

**csrf**

Spring Security4 默认开启了csrf， 默认的登录页面会自动添加一个hidden

	<input name="_csrf" type="hidden" value="e852a8de-6396-4e19-ae42-c1690e6965a1" />

