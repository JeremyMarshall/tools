java -jar /usr/local/opt/jenkins/libexec/jenkins.war&
selenium-server -role hub -hubHost localhost&

selenium-server -role node -hubHost localhost -hubPort 4444 -port 5556 -browser "browserName=chrome,maxinstance=2,platform=MAC" -Dwebdriver.chrome.driver=/usr/local/bin/chromedriver&

selenium-server -role node -hubHost localhost -hubPort 4444 -port 5555 -browser "browserName=safari,maxinstance=2,platform=MAC" &

phantomjs --webdriver=5557 --webdriver-selenium-grid-hub=http://localhost:4444&
