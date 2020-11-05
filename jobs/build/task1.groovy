job('example') {
    scm {
        git {
            remote {
                github('daniyalAhmed-code/Jenkins-JobDsl')
                refspec('+refs/pull/*:refs/remotes/origin/pr/*')
            } 
            branch('${sha1}')
        }
    }
    triggers {
        githubPullRequest {
            admin('daniyalAhmed-code')
            orgWhitelist('DaniyalsOrg')
            cron('H/5 * * * *')
            triggerPhrase('OK to test')
            onlyTriggerPhrase()
            useGitHubHooks()
            permitAll()
            autoCloseFailedPullRequests()
            allowMembersOfWhitelistedOrgsAsAdmin()
            extensions {
                commitStatus {
                    context('deploy to staging site')
                    triggeredStatus('starting deployment to staging site...')
                    startedStatus('deploying to staging site...')
                    statusUrl('http://mystatussite.com/prs')
                    completedStatus('SUCCESS', 'All is well')
                    completedStatus('FAILURE', 'Something went wrong. Investigate!')
                    completedStatus('PENDING', 'still in progress...')
                    completedStatus('ERROR', 'Something went really wrong. Investigate!')
                }
            }
        }
    }
}