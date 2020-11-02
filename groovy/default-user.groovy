import hudson.security.SecurityRealm
import org.jenkinsci.plugins.GithubSecurityRealm
def env = System.getenv()

String githubWebUri = 'https://github.com'
String githubApiUri = 'https://api.github.com'
String clientID = env.CLIENTID
String clientSecret = env.CLIENTSECRET
String oauthScopes = 'read:org,user:email,repo'
SecurityRealm github_realm = new GithubSecurityRealm(githubWebUri, githubApiUri, clientID, clientSecret, oauthScopes)
//check for equality, no need to modify the runtime if no settings changed
if(!github_realm.equals(Jenkins.instance.getSecurityRealm())) {
    Jenkins.instance.setSecurityRealm(github_realm)
    Jenkins.instance.save()
}
