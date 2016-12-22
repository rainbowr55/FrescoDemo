# FrescoDemo
fresco demo

My App has a memory leak that guess lead by Fresco ;
When open a Activity in the device above android 5.0 and then finish the activity ,the activity can not be gc.....

when on the situation that like on activity open another activity and continue open a lot of new activities on the app and close all at the end we found that many of them will not be gc....

more detail of the memory see memory_analysis folder:
![](https://github.com/rainbowr55/FrescoDemo/blob/master/memory_analysis/1482316537(1).jpg)

you'll need override public void onLowMemory() { Fresco.getImagePipeline().clearCaches(); }. Register MemoryTrimmableRegistry for handling memory for activity. You also need to check if you have a memory leak issue in your app.

If your images are being shown in a ListView, GridView, or RecyclerView, this is handled automatically.

Do not use a ScrollView.

If you are using a ViewPager or other similar class, you should call View.onStartTemporaryDetach when your child views go off-screen.

Please post in Stack Overflow if you need more help.
https://stackoverflow.com/users/login?ssrc=anon_ask&returnurl=http%3a%2f%2fstackoverflow.com%2fquestions%2fask%3ftags%3dfresco

https://github.com/facebook/fresco/issues?page=2&q=is%3Aissue+is%3Aclosed+oom&utf8=%E2%9C%93
