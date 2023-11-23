# fun-log

## td-agent / Loki / Grafana

## install td-agent / Loki / Grafana / fluentd output plugin for Grafana Loki

```zsh
brew install td-agent
brew install loki
brew grafana

brew services start loki
brew services start grafana

# launchctl load /Library/LaunchDaemons/td-agent.plist

# install fluentd output plugin for Grafana Loki
/opt/td-agent/usr/sbin/td-agent-gem install fluent-plugin-grafana-loki

sudo launchctl bootout system/td-agent 
sudo launchctl print system/td-agent 
sudo launchctl bootstrap system /Library/LaunchDaemons/td-agent.plist
```

## Loki Files

/usr/local/etc/loki-local-config.yaml

/usr/local/var/log/loki.log

## td-agent Files

/etc/td-agent/td-agent.conf

/var/log/td-agent/td-agent.log

/Library/LaunchDaemons/td-agent.plist

## Grafana Files

/usr/local/etc/grafana/grafana.ini

## logrotate Files

/usr/local/etc/logrotate.conf

