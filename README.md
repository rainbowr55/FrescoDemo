# FrescoDemo
fresco demo

My App has a memery leak that guess lead by Fresco ;
When open a Activity in the device above android 5.0 and then finish the activity ,the activity can not be gc.....

when on the situation that like on activity open another activity and continue open a lot of new activitise on the app and close all at the end we found that many of them will not be gc....

more detail of the memory see memory_analysis folder:
![](https://github.com/rainbowr55/FrescoDemo/blob/master/memory_analysis/1482316537(1).jpg)
