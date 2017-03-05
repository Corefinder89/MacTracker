# NMAP
<b>NMAP</b> (Network Mapper) is a command that can help users discover hosts and services on a computer network. I have used `NMAP` as a service in my application to identify devices that are connected over the network. To install `NMAP` within your system I would suggest my viewers to install `ZENMAP` which is just a GUI wrapper over the `NMAP` command. It would help harness the capabilities of `NMAP` over a light weight GUI. To get `ZENMAP` installed in your system just follow the [link](https://nmap.org/zenmap/). Since I am using a mac environment to set up my application I just downloaded the required version of Zenmap, extracted it and placed it in my application directory. But before installing the application `NMAP` into your mac please check that your machine has the permission to install applications outside your app store. To do that just visit `System Preferences -> Security -> Click on "Anywhere"` To check whether `NMAP` has properly been installed in your machine just run the command `nmap --version`.

# MAC_IDENTIFIER
The `MAC_IDENTIFIER` directory has a java logic written that would extract the MAC Address and the device name connected over the network. A `BufferedReader` object would contain the required `nmap` dump which can be iterated to get the corresponding mac address of the device connected over the network and the device name as well.

# TRACKER_EXECUTE
The `TRACKER_EXECUTE` directory has two shell scripts. `run_nmap.sh` would run the `nmap` command and dump the entire log into a file called `nmap`. The JAVA logic written utilises this dump to iterate the MAC address and the device name. Then comes the logic for `Extractor.sh`, it simply traverses to the `MAC_IDENTIFIER` directory, compiles and executes the java class.

Now comes, the interesting part of setting a cron job to automate the entire process.

# TASK_RUNNER
Under the root directory I have another shell executed that basically runs my two processes of dumping the `nmap log` and iterating the `java logic` there after.

# Setting the cron job
UNIX and LINUX by default provides a default service called crontab that helps in executing services periodically. I have a cron job set that would run this `task_runner` logic every after 30 minutes. Here is the logic for it.<br>
`*/30 * * * * /Users/soumyajit/Documents/git_repos/target_mac/task_runner.sh > /Users/soumyajit/Documents/git_repos/target_mac/task_runner.log 2>&1`
