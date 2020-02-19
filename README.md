
Python=3.4
Download [sip](https://www.riverbankcomputing.com/static/Downloads/sip/4.19.21/sip-4.19.21.tar.gz)

```bash

 tar -xvf sip-4.19.21.tar.gz
 python configure.py -d ~/where/python/installed/lib/python3.4/site-packages/
 make
 make install
 make clean
 python -m pip install -i https://pypi.tuna.tsinghua.edu.cn/simple PyQt5


python -m pip install -i https://pypi.tuna.tsinghua.edu.cn/simple pyecharts==0.5.5
python -m pip install -i https://pypi.tuna.tsinghua.edu.cn/simple pymongo
python -m pip install -i https://pypi.tuna.tsinghua.edu.cn/simple lxml==3.4.2



```

Before you start to run the code, first of all, make sure the `mongod` is already installed and run.

If not installed, please try:

```bash
brew update
brew install mongodb
mkdir -p /data/db
sudo mongod
```

If the mongodb is already installed, just:

```bash
sudo mongod
```






# StockSpider
股票数据爬虫+分析+可视化框架
