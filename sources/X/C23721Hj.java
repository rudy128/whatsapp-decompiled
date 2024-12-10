package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Hj  reason: invalid class name and case insensitive filesystem */
public class C23721Hj implements Application.ActivityLifecycleCallbacks {
    public boolean A00 = true;
    public boolean A01;
    public int A02;
    public AnonymousClass1Be A03 = AnonymousClass1Be.A01;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass18K A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final Runnable A0B = new C449025f((Object) this, 15);
    public final C19880zA A0C;
    public final C19880zA A0D;
    public final C18030ve A0E;
    public final AnonymousClass1DC A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;

    public void onActivityPaused(Activity activity) {
        Activity activity2 = activity;
        if (!(activity instanceof AnonymousClass3KH)) {
            StringBuilder sb = new StringBuilder();
            sb.append("pause_");
            sb.append(activity.getClass());
            ((AnonymousClass1Bd) this.A0Z.get()).A07(sb.toString());
        }
        if (!(activity instanceof C108885cS)) {
            ((C133846pb) this.A0L.get()).A00();
        }
        A01(activity, "Pause", true);
        if (this.A05) {
            this.A07.CGN(new AnonymousClass7RT(this, activity2, new AnonymousClass1Be(this.A03.A00), 4, this.A01));
        }
        ((C30121dQ) this.A0T.get()).A03 = new WeakReference((Object) null);
        if (((Number) this.A0A.get()).intValue() > 0) {
            ((AnonymousClass1KB) this.A08.get()).A0I(this.A0B);
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        A00(activity, false, "onCreated");
    }

    public void onActivityPostResumed(Activity activity) {
        A00(activity, false, "onResumed");
        A00(activity, true, "onRendered");
    }

    public void onActivityPostStarted(Activity activity) {
        A00(activity, false, "onStarted");
    }

    public void onActivityPreResumed(Activity activity) {
        A00(activity, true, "onResumed");
    }

    public void onActivityPreStarted(Activity activity) {
        A00(activity, true, "onStarted");
    }

    public static void A00(Activity activity, Boolean bool, String str) {
        if (activity instanceof AnonymousClass1FO) {
            AnonymousClass1FO r2 = (AnonymousClass1FO) activity;
            if (r2.A31() != 78318969) {
                return;
            }
            if (bool.booleanValue()) {
                r2.A3D(str);
            } else {
                r2.A3C(str);
            }
        }
    }

    private void A01(Activity activity, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = activity.getClass();
        sb.append(cls.getName());
        sb.append(".on");
        sb.append(str);
        Log.i(sb.toString());
        if (z) {
            ((C223819r) this.A0d.get()).A02(cls.getSimpleName(), str);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(activity, "Create", true);
        if (this.A02 == 0) {
            ((AnonymousClass1Bd) this.A0Z.get()).A09 = true;
        }
        if (activity instanceof AnonymousClass1FL) {
            ((AnonymousClass1FL) activity).A03.A00.A03.A0q((C27461We) this.A0N.get(), true);
        }
        Window window = activity.getWindow();
        window.setCallback(new C27531Wl(window.getCallback(), (C27521Wk) this.A0c.get(), (C27501Wi) this.A0J.get()));
        C19880zA r1 = this.A0D;
        if (r1.A07()) {
            r1.A03();
            throw new NullPointerException("monitor");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = activity;
        A01(activity, "Destroy", false);
        ((C57522jD) this.A0W.get()).A00();
        C30211dZ r5 = (C30211dZ) this.A0O.get();
        StringBuilder sb = new StringBuilder();
        sb.append("Activity_");
        sb.append(activity.getClass().getSimpleName());
        sb.append("_");
        sb.append(activity.hashCode());
        String obj = sb.toString();
        ConcurrentHashMap concurrentHashMap = r5.A04;
        if (!concurrentHashMap.containsKey(obj) && ((long) concurrentHashMap.size()) <= 100) {
            concurrentHashMap.put(obj, new C71203Ei(activity2, obj, r5.A03, SystemClock.elapsedRealtime()));
            r5.A02.CGL(new C70583Br(r5, 26), "MemoryLeakReporter.pruneRefs");
        }
        C19880zA r1 = this.A0C;
        if (r1.A07()) {
            r1.A03();
            throw new NullPointerException("analyzeBundle");
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Activity activity2 = activity;
        if (activity2 instanceof AnonymousClass1FO) {
            AnonymousClass1FO r5 = (AnonymousClass1FO) activity2;
            if (r5.A31() == 78318969) {
                AnonymousClass1HB r4 = r5.A00;
                r4.A01.A0D(activity2.getClass().getSimpleName(), -1);
                r5.A3D("onCreated");
            }
            AnonymousClass00H r1 = this.A0Y;
            if (!((C24001Il) r1.get()).A01.get()) {
                C24001Il r8 = (C24001Il) r1.get();
                if (r8.A06() && !r8.A01.getAndSet(true)) {
                    CUv cUv = (CUv) r8.A08.getValue();
                    String packageName = r8.A03.getPackageName();
                    C18070vi.A0b(packageName);
                    C18070vi.A0d(packageName, 0);
                    ComponentName componentName = new ComponentName(packageName, "com.whatsapp.HomeActivity");
                    ArrayList A062 = AnonymousClass1ZU.A06(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.Conversation")));
                    if (((Boolean) r8.A05.getValue()).booleanValue()) {
                        A062.add(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.chatinfo.ContactInfoActivity")));
                        A062.add(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.group.GroupChatInfoActivity")));
                        A062.add(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.chatinfo.ListChatInfoActivity")));
                        A062.add(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.newsletter.NewsletterInfoActivity")));
                        A062.add(new AnonymousClass1D6(componentName, new ComponentName(packageName, "com.whatsapp.gallery.MediaGalleryActivity")));
                    }
                    C18100vl r12 = r8.A07;
                    if (((Boolean) r12.getValue()).booleanValue()) {
                        ComponentName componentName2 = new ComponentName(packageName, "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                        A062.add(new AnonymousClass1D6(componentName, componentName2));
                        A062.add(new AnonymousClass1D6(componentName2, new ComponentName(packageName, "com.whatsapp.Conversation")));
                    }
                    ArrayList arrayList = new ArrayList(C29351c6.A0C(A062, 10));
                    Iterator it = A062.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
                        arrayList.add(new C25150Ca1((ComponentName) r0.first, (ComponentName) r0.second));
                    }
                    Set A12 = C29431cG.A12(arrayList);
                    C25780Clr clr = BMq.A04;
                    C25780Clr clr2 = BMq.A03;
                    C25644CjX cjX = C25644CjX.A03;
                    C25644CjX cjX2 = C25644CjX.A02;
                    C25785Clw clw = C25785Clw.A02;
                    C25645CjY cjY = C25645CjY.A03;
                    new C25773Clk(cjY, clw);
                    cUv.A00(new C22727BMo(clr, clr2, new C25773Clk(cjY, C24508C7c.A00(0.4f)), cjX, cjX2, A12));
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(packageName, "com.whatsapp.home.ui.HomePlaceholderActivity"));
                    List singletonList = Collections.singletonList("com.whatsapp.HomeActivity");
                    C18070vi.A0X(singletonList);
                    cUv.A00(C24001Il.A00(intent, packageName, singletonList));
                    if (((Boolean) r12.getValue()).booleanValue()) {
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName(packageName, "com.whatsapp.home.ui.StarredMessagesPlaceholderActivity"));
                        List singletonList2 = Collections.singletonList("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                        C18070vi.A0X(singletonList2);
                        cUv.A00(C24001Il.A00(intent2, packageName, singletonList2));
                    }
                    List<String> asList = Arrays.asList(new String[]{"com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity", "com.whatsapp.authentication.AppAuthenticationActivity"});
                    C18070vi.A0X(asList);
                    ArrayList arrayList2 = new ArrayList(C29351c6.A0C(asList, 10));
                    for (String componentName3 : asList) {
                        arrayList2.add(new C25129CZc(new ComponentName(packageName, componentName3)));
                    }
                    cUv.A00(new C22726BMn(C29431cG.A12(arrayList2)));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResumed(android.app.Activity r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Resume"
            r4 = 1
            r5 = r10
            r6 = r11
            r10.A01(r11, r0, r4)
            boolean r0 = r11 instanceof X.AnonymousClass1FW
            if (r0 == 0) goto L_0x008a
            r0 = r6
            X.1FW r0 = (X.AnonymousClass1FW) r0
            X.0vt r3 = r0.BYS()
        L_0x0013:
            X.18K r2 = r10.A06
            X.1eO r0 = new X.1eO
            r0.<init>()
            r1 = 0
            X.1Be r0 = r2.BDn(r0, r3)
            r10.A03 = r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0086
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            boolean r0 = r0.nextBoolean()
            if (r0 == 0) goto L_0x0081
            r10.A01 = r4
            r9 = 1
        L_0x0033:
            r10.A05 = r1
            if (r9 == 0) goto L_0x004b
            X.1Be r0 = r10.A03
            java.lang.Integer r0 = r0.A00
            X.1Be r7 = new X.1Be
            r7.<init>(r0)
            X.10I r0 = r10.A07
            r8 = 4
            X.7RT r4 = new X.7RT
            r4.<init>(r5, r6, r7, r8, r9)
            r0.CGN(r4)
        L_0x004b:
            X.00H r0 = r10.A0T
            java.lang.Object r1 = r0.get()
            X.1dQ r1 = (X.C30121dQ) r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r1.A03 = r0
            X.00H r1 = r10.A0A
            java.lang.Object r0 = r1.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0080
            X.00H r0 = r10.A08
            java.lang.Object r3 = r0.get()
            X.1KB r3 = (X.AnonymousClass1KB) r3
            java.lang.Runnable r2 = r10.A0B
            java.lang.Object r0 = r1.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r3.A0K(r2, r0)
        L_0x0080:
            return
        L_0x0081:
            r10.A01 = r1
            r10.A05 = r4
            goto L_0x004b
        L_0x0086:
            r10.A01 = r1
            r9 = 0
            goto L_0x0033
        L_0x008a:
            X.0vt r3 = X.C19620yd.A03
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23721Hj.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19880zA r1 = this.A0C;
        if (r1.A07()) {
            r1.A03();
            throw new NullPointerException("registerActivity");
        }
    }

    public void onActivityStarted(Activity activity) {
        A01(activity, "Start", true);
        if (this.A02 == 0 && !this.A04) {
            Log.i("app-init/application foregrounded");
            C25431Oe r0 = (C25431Oe) this.A0X.get();
            C25431Oe.A00(r0);
            C25431Oe.A01(r0);
            Object obj = this.A0S.get();
            C18070vi.A0d(activity, 0);
            C18070vi.A0d(obj, 1);
            C29631cb.A02((C29631cb) this.A0R.get(), new C448825d(activity, obj, 12));
            AnonymousClass00H r1 = this.A0U;
            if (!((AnonymousClass194) r1.get()).A02() && !((AnonymousClass194) r1.get()).A01()) {
                ((C219017v) this.A0Q.get()).A0B(1, true, false, false, false);
            }
            C30051dJ r3 = (C30051dJ) this.A0I.get();
            AnonymousClass1O1 r12 = (AnonymousClass1O1) r3.A0K.get();
            r3.A0I.execute(new C449625l(0, AnonymousClass1O1.A00(r12, r12.A01), r3));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C19830z4 r4 = ((AnonymousClass1XL) this.A0G.get()).A02;
            if (elapsedRealtime < ((SharedPreferences) r4.A00.get()).getLong("app_background_time", 0)) {
                C19830z4.A00(r4).putLong("app_background_time", -1800000).apply();
            }
            AnonymousClass195 r13 = (AnonymousClass195) this.A0H.get();
            r13.A00 = true;
            r13.notifyAllObservers(new C30061dK());
            C30441dx r32 = (C30441dx) this.A0e.get();
            if (r32.A01.A03) {
                ((C200710s) r32.A03.getValue()).execute(new C146747Ql(r32, 26));
            }
        }
        int i = this.A02;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        this.A00 = z;
        this.A02 = i + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof C27531Wl)) {
            window.setCallback(new C27531Wl(callback, (C27521Wk) this.A0c.get(), (C27501Wi) this.A0J.get()));
        }
        AnonymousClass1XL r2 = (AnonymousClass1XL) this.A0G.get();
        C19830z4 r14 = r2.A02;
        if (r14.A2T() && !r2.A03()) {
            Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
            r14.A27(false);
            r2.A02(false);
        }
    }

    public void onActivityStopped(Activity activity) {
        C39641tP r0;
        A01(activity, "Stop", true);
        C19880zA r1 = this.A0C;
        if (r1.A07()) {
            r1.A03();
            throw new NullPointerException("analyzeBundle");
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.A04 = isChangingConfigurations;
        int i = this.A02 - 1;
        this.A02 = i;
        if (i == 0 && !isChangingConfigurations) {
            ((C223819r) this.A0d.get()).A02("App", "backgrounded");
            Log.i("app-init/application backgrounded");
            AnonymousClass1Bd r12 = (AnonymousClass1Bd) this.A0Z.get();
            r12.A07("app_session_ended");
            r12.A09 = false;
            C55622g6 r5 = (C55622g6) this.A0P.get();
            r5.A04.CGF(new C70643By(r5, this.A0b.get(), 16));
            if (!"com.whatsapp.authentication.AppAuthenticationActivity".equals(activity.getClass().getName())) {
                AnonymousClass1XL r2 = (AnonymousClass1XL) this.A0G.get();
                if (!r2.A03.A00.getBoolean("app_lock_auth_needed", true)) {
                    Log.i("AppAuthManager/onApplicationBackground");
                    r2.A02(true);
                    C19830z4 r02 = r2.A02;
                    C19830z4.A00(r02).putLong("app_background_time", SystemClock.elapsedRealtime()).apply();
                }
            }
            ((C31191fA) this.A0M.get()).A03 = false;
            C36711oL r22 = (C36711oL) this.A0V.get();
            if ((C36711oL.A00(r22) || r22.A03.BfT(689639794)) && (r0 = r22.A00) != null) {
                r0.report();
                r22.A01 = false;
                r22.A00 = null;
            }
            C30051dJ r52 = (C30051dJ) this.A0I.get();
            AnonymousClass1O1 r13 = (AnonymousClass1O1) r52.A0K.get();
            r52.A0I.execute(new C21452AkJ(25, AnonymousClass1O1.A00(r13, r13.A01), r52));
            List<C24785CKe> list = (List) ((C52832bY) this.A0a.get()).A00.get(0);
            if (list != null) {
                for (C24785CKe cKe : list) {
                    C22915BVd bVd = cKe.A00;
                    C18070vi.A0d(bVd, 0);
                    ((E50) bVd.A02).BRR(AnonymousClass00R.A00).execute(new C27082DTh((Object) bVd, 38));
                }
            }
            AnonymousClass195 r14 = (AnonymousClass195) this.A0H.get();
            r14.A00 = false;
            r14.notifyAllObservers(new AnonymousClass7KX(1));
            C30441dx r3 = (C30441dx) this.A0e.get();
            if (r3.A01.A03) {
                ((C200710s) r3.A03.getValue()).execute(new C146747Ql(r3, 27));
            }
            this.A00 = true;
        }
    }

    public C23721Hj(C19880zA r3, C19880zA r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass1DC r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35) {
        this.A0E = r5;
        this.A08 = r9;
        this.A07 = r8;
        this.A0U = r10;
        this.A06 = r6;
        this.A09 = r11;
        this.A0F = r7;
        this.A0G = r12;
        this.A0I = r13;
        this.A0J = r14;
        this.A0Z = r15;
        this.A0b = r16;
        this.A0M = r17;
        this.A0a = r18;
        this.A0K = r19;
        this.A0X = r21;
        this.A0c = r20;
        this.A0T = r25;
        this.A0L = r22;
        this.A0O = r23;
        this.A0Y = r24;
        this.A0P = r26;
        this.A0Q = r28;
        this.A0V = r27;
        this.A0H = r29;
        this.A0N = r30;
        this.A0W = r31;
        this.A0D = r3;
        this.A0S = r32;
        this.A0d = r33;
        this.A0e = r34;
        this.A0R = r35;
        this.A0C = r4;
        this.A02 = 0;
        this.A0A = C23731Hk.A00(new C70943Dc(r5, 0));
    }
}
