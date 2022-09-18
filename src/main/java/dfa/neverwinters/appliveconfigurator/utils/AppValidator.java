package dfa.neverwinters.appliveconfigurator.utils;

import java.io.File;

public class AppValidator
{

    /**
     * <p>AppValidator</p>
     * <p>Private class constructor.</p>
     */
    private AppValidator() { }

    /**
     * <p>usersConfigFileExists</p>
     * <p>Method to validate if the users configuration file exists.</p>
     * @return true if and only if the configuration file for users (users.yml) exists; false otherwise
     */
    public static boolean usersConfigFileExists()
    {
        File usersConfigFile = new File(AppConstants.CONSOLE_USERS_FILE_PATH);
        return usersConfigFile.exists();

    }

}
