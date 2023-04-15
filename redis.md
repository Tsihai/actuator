# Mac安装Redis

## 使用Homebrew安装Redis

### 安装 Homebrew 国内源
```
/bin/zsh -c "$(curl -fsSL https://gitee.com/cunkai/HomebrewCN/raw/master/Homebrew.sh)"
```

### 安装 Redis
```
brew install redis
```

#### 查看安装及配置文件位置

- Homebrew 安装的软件会默认在/usr/local/Cellar/路径下
- redis 的配置文件redis.conf存放在/usr/local/etc路径下

#### 启动 Redis
```
// 方式一：使用brew帮助我们启动软件
brew services start redis

// 方式二
redis-server /usr/local/etc/redis.con

// 方式三
redis-server
```

#### 查看redis服务进程
```
ps axu | grep redis
```

#### 使用 redis-cli 连接 redis 服务
redis默认端口号6379，默认auth为空，输入以下命令即可连接
```
redis-cli -h 127.0.0.1 -p 6379
```

#### 关闭 redis
```
redis-cli shutdown
```

#### redis 设置密码
启动 redis 服务后，另外开启一个终端，连接到 redis-cli。
```
redis-cli -h 127.0.0.1 -p 6379
```

此时的登陆密码为空，可以直接登陆，接下来我们设置密码:
```
config set requirepass 123456
```

获取登陆密码：
```
config get requirepass
```

如果显示报错：NOAUTH Authentication required，则提示我们需要输入密码：
```
auth 123456
```

### 安装 redis 可视化
#### Redis Desktop Manager
Github 下载地址：https://github.com/qishibo/AnotherRedisDesktopManager/releases/tag/v1.5.9

如果打不开。你应该把它移到废纸篓。你可以尝试在终端中输入命令解决，需要输入本机登陆密码：
```
sudo xattr -rd com.apple.quarantine /Applications/Another\ Redis\ Desktop\Manager.app
```

登陆方法：
- 连接地址：127.0.0.1
- 密码：123456