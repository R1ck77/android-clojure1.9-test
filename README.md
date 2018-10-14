Minimum reproducible example for an issue I'm having with Android 8 and Clojure 1.9

The problem happens on my Android 8 Huawei Mate 10 Pro with Android 8, where it works fine on my LG Nexus 5 (which mounts Android 6 something, I think…).

When executed, the program fails with the following exception:

    10-14 18:29:55.824 13023 13023 E AndroidRuntime: FATAL EXCEPTION: main
    10-14 18:29:55.824 13023 13023 E AndroidRuntime: Process: couchgames.clojure19test, PID: 13023
    10-14 18:29:55.824 13023 13023 E AndroidRuntime: java.lang.ExceptionInInitializerError
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at java.lang.Class.classForName(Native Method)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at java.lang.Class.forName(Class.java:453)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.classForName(RT.java:2204)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.classForName(RT.java:2213)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.loadClassForName(RT.java:2232)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.load(RT.java:450)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.load(RT.java:426)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.doInit(RT.java:468)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.<clinit>(RT.java:336)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Namespace.<init>(Namespace.java:34)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Namespace.findOrCreate(Namespace.java:176)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Var.internPrivate(Var.java:153)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at test.library.ClojureLibrary.<clinit>(Unknown Source:4)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at test.library.ClojureLibrary.sayHello(Unknown Source:0)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at couchgames.clojure19test.MainActivity.onStart(MainActivity.java:25)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.Instrumentation.callActivityOnStart(Instrumentation.java:1339)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.Activity.performStart(Activity.java:7392)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3157)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3302)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.ActivityThread.-wrap12(Unknown Source:0)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1891)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.os.Handler.dispatchMessage(Handler.java:108)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.os.Looper.loop(Looper.java:166)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at android.app.ActivityThread.main(ActivityThread.java:7425)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at java.lang.reflect.Method.invoke(Native Method)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:245)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:921)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime: Caused by: java.lang.UnsupportedOperationException: can't load this type of class file, compiling:(clojure/core_instant18.clj:9:1)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler.analyzeSeq(Compiler.java:7010)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler.analyze(Compiler.java:6773)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler.eval(Compiler.java:7059)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler.load(Compiler.java:7514)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.loadResourceScript(RT.java:379)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.loadResourceScript(RT.java:370)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.load(RT.java:460)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RT.load(RT.java:426)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core$load$fn__6548.invoke(core.clj:6046)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core$load.invokeStatic(core.clj:6045)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core$load.doInvoke(core.clj:6029)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.RestFn.invoke(RestFn.java:408)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core$fn__8055.invokeStatic(core.clj:6709)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core$fn__8055.invoke(core.clj:6708)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core__init.load(Unknown Source:6708)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.core__init.<clinit>(Unknown Source:91)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        ... 27 more
    10-14 18:29:55.824 13023 13023 E AndroidRuntime: Caused by: java.lang.UnsupportedOperationException: can't load this type of class file
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at java.lang.ClassLoader.defineClass(ClassLoader.java:517)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.DynamicClassLoader.defineClass(DynamicClassLoader.java:46)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler$ObjExpr.getCompiledClass(Compiler.java:4979)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler$FnExpr.parse(Compiler.java:4109)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        at clojure.lang.Compiler.analyzeSeq(Compiler.java:7001)
    10-14 18:29:55.824 13023 13023 E AndroidRuntime:        ... 42 more

The problem is Clojure 1.9 specific, as compiling the Clojure library I include in the project with Clojure 1.8, everything works fine.