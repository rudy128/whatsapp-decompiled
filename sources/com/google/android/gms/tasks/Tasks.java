package com.google.android.gms.tasks;

import X.AnonymousClass26x;
import X.C18210vx;
import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    public static void A00() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static Object await(Task task) {
        C18210vx.A04("Must not be called on the main application thread");
        A00();
        C18210vx.A02(task, "Task must not be null");
        if (!task.isComplete()) {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            zzad.zza();
        }
        return zza(task);
    }

    @Deprecated
    public static Task call(Callable callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static Task forCanceled() {
        zzw zzw = new zzw();
        zzw.zzc();
        return zzw;
    }

    public static Task forException(Exception exc) {
        zzw zzw = new zzw();
        zzw.zza(exc);
        return zzw;
    }

    public static Task forResult(Object obj) {
        zzw zzw = new zzw();
        zzw.zzb(obj);
        return zzw;
    }

    public static Task whenAll(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            zzw zzw = new zzw();
            zzw.zzb((Object) null);
            return zzw;
        }
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzw2 = new zzw();
        zzaf zzaf = new zzaf(collection.size(), zzw2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzb((Task) it.next(), zzaf);
        }
        return zzw2;
    }

    public static Task whenAllComplete(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            List emptyList = Collections.emptyList();
            zzw zzw = new zzw();
            zzw.zzb(emptyList);
            return zzw;
        }
        return whenAllComplete(TaskExecutors.MAIN_THREAD, (Collection) Arrays.asList(taskArr));
    }

    public static Task whenAllSuccess(Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            List emptyList = Collections.emptyList();
            zzw zzw = new zzw();
            zzw.zzb(emptyList);
            return zzw;
        }
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, (Collection) Arrays.asList(taskArr));
    }

    public static Task withTimeout(Task task, long j, TimeUnit timeUnit) {
        C18210vx.A02(task, "Task must not be null");
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        C18210vx.A07(z, "Timeout must be positive");
        C18210vx.A02(timeUnit, "TimeUnit must not be null");
        zzb zzb = new zzb();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzb);
        AnonymousClass26x r3 = new AnonymousClass26x(Looper.getMainLooper());
        r3.postDelayed(new zzx(taskCompletionSource), timeUnit.toMillis(j));
        task.addOnCompleteListener(new zzy(r3, taskCompletionSource, zzb));
        return taskCompletionSource.zza;
    }

    public static void zzb(Task task, zzae zzae) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, (OnSuccessListener) zzae);
        task.addOnFailureListener(executor, (OnFailureListener) zzae);
        task.addOnCanceledListener(executor, (OnCanceledListener) zzae);
    }

    public static Object zza(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (((zzw) task).zzd) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static Object await(Task task, long j, TimeUnit timeUnit) {
        C18210vx.A04("Must not be called on the main application thread");
        A00();
        C18210vx.A02(task, "Task must not be null");
        C18210vx.A02(timeUnit, "TimeUnit must not be null");
        if (!task.isComplete()) {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            if (!zzad.zza.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        return zza(task);
    }

    @Deprecated
    public static Task call(Executor executor, Callable callable) {
        C18210vx.A02(executor, "Executor must not be null");
        C18210vx.A02(callable, "Callback must not be null");
        zzw zzw = new zzw();
        executor.execute(new zzz(zzw, callable));
        return zzw;
    }

    public static Task whenAll(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll((Collection) Arrays.asList(taskArr));
        }
        zzw zzw = new zzw();
        zzw.zzb((Object) null);
        return zzw;
    }

    public static Task whenAllComplete(Executor executor, Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(executor, (Collection) Arrays.asList(taskArr));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }

    public static Task whenAllSuccess(Executor executor, Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(executor, (Collection) Arrays.asList(taskArr));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }

    public static Task whenAllComplete(Executor executor, Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWithTask(executor, new zzab(collection));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }

    public static Task whenAllSuccess(Executor executor, Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWith(executor, new zzaa(collection));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }

    public static Task whenAllComplete(Collection collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task whenAllSuccess(Collection collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }
}
