package belkamel.projectfinal.backend.tools;

import java.util.Map;

public final class Values {
    private static final Map<String, String> roles;
    public static final String API_PREFIX = "/api/v1";

    static {
        roles = Map.of("admin", "ADMIN", "dev", "DEV", "client", "CLIENT");
    }

    public Values() {}

    public static String getRole(String role) {
        return roles.get(role);
    }
}
