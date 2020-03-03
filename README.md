# SeleniumGridWithDocker
# Docker installation for windows : 
Follow https://docs.docker.com/docker-for-windows/install/

# Steps To Setup Hub : 
1. Execute command “docker pull selenium/hub” 
2. Execute command “docker run -d –name selenium-grid-hub selenium/hub” to start the Hub.
3. Hit http://192.168.99.100:4444/grid URL to see grid console

# Steps To Setup Nodes :
1. Execute “docker pull selenium/node-chrome” to get a Chrome Node.
2. Execute “docker pull selenium/node-firefox” to get a Firefox Node.
3. Execute “docker run -d –link selenium-grid-hub:hub selenium/node-chrome”
4. Execute “docker run -d –link selenium-grid-hub:hub selenium/node-firefox” to link the two Nodes to the Hub

# Install debug Nodes to watch test browser execution
1. Run “docker pull selenium/node-firefox-debug” to add Firefox debug Node.
2. Run “docker pull selenium/node-chrome-debug” to add Chrome debug Node.
3. Run “docker run -d —link selenium-grid-hub:hub selenium/node-chrome-debug”
4. Run “docker run -d —link selenium-grid-hub:hub selenium/node-firefox-debug” to link debug Nodes to Hub

Run “docker ps -a” to list all the containers

# Download VNC viewer for your operating platform. Start VNC viewer.
1. Click “File —> New connection” to connect to the chrome-debug Node in grid. Add correct debug url
2. Click “File —> New connection” to connect to the firefox-debug Node in grid.
3. Input VCN viewer connection password, the default password is “secret”.
4. Then you connect to the chrome debug Node success and you can see the chrome web browser running when you run test cases scripts in this Node.

There is also a GUI program that can manage and change local port map. Click Kitematic icon in the desktop or startup menu.
When Kitematic start up. Left panel is the list of containers, right panel is the detail information for each selected container.
You can change the ports and get url to connect to the chrome-debug Node in grid

