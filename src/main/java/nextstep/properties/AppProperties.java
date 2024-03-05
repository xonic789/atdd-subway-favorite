package nextstep.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "subway.app")
public class AppProperties {

    private GithubProperties github;


    public AppProperties() {
    }

    public AppProperties(GithubProperties github) {
        this.github = github;
    }

    public GithubProperties getGithub() {
        return github;
    }

    public void setGithub(GithubProperties github) {
        this.github = github;
    }

    @ConstructorBinding
    public static class GithubProperties {

        private String clientId;
        private String clientSecret;
        private String accessTokenUri;
        private String userInfoUri;

        public GithubProperties(String clientId, String clientSecret,
            String accessTokenUri, String userInfoUri) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.accessTokenUri = accessTokenUri;
            this.userInfoUri = userInfoUri;
        }

        public GithubProperties() {
        }

        public String getClientId() {
            return clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public String getAccessTokenUri() {
            return accessTokenUri;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public void setAccessTokenUri(String accessTokenUri) {
            this.accessTokenUri = accessTokenUri;
        }

        public void setUserInfoUri(String userInfoUri) {
            this.userInfoUri = userInfoUri;
        }

        public String getUserInfoUri() {
            return userInfoUri;
        }
    }
}