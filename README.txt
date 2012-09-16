######################################
# ProjectX: Installation guide       #
# (cmd-line and eclipse integration) #
######################################

1. Clone the git repo (e.g. git clone git@github.com:delsener/zhaw_mdp_projectX.git)
2. Change into the root folder of the project (zhaw_mdp_projectX)
3. Run "mvn install" to run a full build (dependency resolving, testing and packaging)

For eclipse integration:
4. Run "mvn eclipse:eclipse" to create all eclipse specific project files 
5. Run eclipse and import the project as "Existing java project"