package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.3DB  reason: invalid class name */
public class AnonymousClass3DB implements Callable {
    public final int A00;
    public final Object A01;

    public AnonymousClass3DB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object call() {
        C22901Dq r2;
        switch (this.A00) {
            case 0:
                C18500wX r5 = (C18500wX) this.A01;
                synchronized (r5) {
                    C19660yh r4 = (C19660yh) r5.A01.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String A012 = ((C18660ww) r5.A02.get()).A01();
                    synchronized (r4) {
                        String A002 = C19660yh.A00(r4, currentTimeMillis);
                        SharedPreferences sharedPreferences = r4.A00;
                        String str = "";
                        if (sharedPreferences.getString("last-used-date", str).equals(A002)) {
                            String A013 = C19660yh.A01(r4, A002);
                            if (A013 != null && !A013.equals(A012)) {
                                C19660yh.A02(r4, A002);
                                HashSet hashSet = new HashSet(sharedPreferences.getStringSet(A012, C17880vN.A12()));
                                hashSet.add(A002);
                                sharedPreferences.edit().putStringSet(A012, hashSet).commit();
                            }
                        } else {
                            long j = sharedPreferences.getLong("fire-count", 0);
                            if (j + 1 == 30) {
                                long j2 = sharedPreferences.getLong("fire-count", 0);
                                Iterator A15 = AnonymousClass000.A15(sharedPreferences.getAll());
                                String str2 = null;
                                while (A15.hasNext()) {
                                    Map.Entry A16 = AnonymousClass000.A16(A15);
                                    if (A16.getValue() instanceof Set) {
                                        Iterator it = ((Set) A16.getValue()).iterator();
                                        while (it.hasNext()) {
                                            String A0v = C17880vN.A0v(it);
                                            if (str2 == null || str2.compareTo(A0v) > 0) {
                                                str = C17880vN.A0x(A16);
                                                str2 = A0v;
                                            }
                                        }
                                    }
                                }
                                HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet(str, C17880vN.A12()));
                                hashSet2.remove(str2);
                                sharedPreferences.edit().putStringSet(str, hashSet2).putLong("fire-count", j2 - 1).commit();
                                j = sharedPreferences.getLong("fire-count", 0);
                            }
                            HashSet hashSet3 = new HashSet(sharedPreferences.getStringSet(A012, C17880vN.A12()));
                            hashSet3.add(A002);
                            sharedPreferences.edit().putStringSet(A012, hashSet3).putLong("fire-count", j + 1).putString("last-used-date", A002).commit();
                        }
                    }
                }
                return null;
            case 1:
                AnonymousClass11S r42 = (AnonymousClass11S) this.A01;
                try {
                    Method method = AnonymousClass1CH.A03;
                    Trace.beginSection("MeManager/loadMe");
                    AnonymousClass11U r52 = r42.A07;
                    r52.A03();
                    Log.i("memanager/load-me");
                    Context context = r42.A08.A00;
                    if (C17880vN.A0e(context.getFilesDir(), "me").exists()) {
                        try {
                            FileInputStream openFileInput = context.openFileInput("me");
                            try {
                                r2 = new C22901Dq(openFileInput);
                                AnonymousClass11S.A03((Me) r2.readObject(), r42);
                                r52.A01();
                                r2.close();
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                            } catch (Throwable th) {
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                throw th;
                            }
                        } catch (ClassNotFoundException e) {
                            Log.w("memanager/read_me/serialization_error", e);
                        } catch (IOException e2) {
                            Log.e("memanager/read_me/io_error", e2);
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                    }
                    if (r52.A06()) {
                        r52.A02();
                    }
                    Trace.endSection();
                    return null;
                } catch (Throwable th3) {
                    AnonymousClass11U r1 = r42.A07;
                    if (r1.A06()) {
                        r1.A02();
                    }
                    Method method2 = AnonymousClass1CH.A03;
                    Trace.endSection();
                    throw th3;
                }
            default:
                AnonymousClass1Cd r12 = (AnonymousClass1Cd) this.A01;
                AnonymousClass11S r0 = r12.A00;
                r0.A0I();
                if (r0.A00 != null) {
                    return null;
                }
                r12.A01.A01();
                return null;
        }
        throw th;
    }
}
