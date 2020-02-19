
all:
	@(cd sipgen; $(MAKE))
	@(cd siplib; $(MAKE))

install:
	@(cd sipgen; $(MAKE) install)
	@(cd siplib; $(MAKE) install)
	@test -d $(DESTDIR)/Users/dxl/miniconda3/envs/Python_Scrapy/lib/python3.4/site-packages || mkdir -p $(DESTDIR)/Users/dxl/miniconda3/envs/Python_Scrapy/lib/python3.4/site-packages
	cp -f sipconfig.py $(DESTDIR)/Users/dxl/miniconda3/envs/Python_Scrapy/lib/python3.4/site-packages/sipconfig.py
	cp -f /Users/dxl/Documents/Python/Github/Crawl/Stock/StockSpider-1/sip-4.19.21/sipdistutils.py $(DESTDIR)/Users/dxl/miniconda3/envs/Python_Scrapy/lib/python3.4/site-packages/sipdistutils.py
	/Users/dxl/miniconda3/envs/Python_Scrapy/bin/python /Users/dxl/Documents/Python/Github/Crawl/Stock/StockSpider-1/sip-4.19.21/mk_distinfo.py "$(DESTDIR)" /Users/dxl/miniconda3/envs/Python_Scrapy/lib/python3.4/site-packages/sip-4.19.21.dist-info installed.txt

clean:
	@(cd sipgen; $(MAKE) clean)
	@(cd siplib; $(MAKE) clean)
