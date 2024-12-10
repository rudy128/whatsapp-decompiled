package com.whatsapp.bridge.wfs;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.BAU;
import X.C139576z4;
import X.C17890vO;
import X.C189979kA;
import X.C198779yt;
import X.C21446AkD;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31081ez;
import X.C31751g4;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1", f = "WfsManager.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class WfsManager$startWfs$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C139576z4 $abOfflineProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ BAU $listener;
    public int label;
    public final /* synthetic */ C198779yt this$0;

    @DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1", f = "WfsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            C198779yt r3 = r7;
            return new AnonymousClass1(context, bau, r3, r8, r8);
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x02a3 A[Catch:{ Exception -> 0x02aa }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5 A[Catch:{ Exception -> 0x02aa }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0214 A[Catch:{ Exception -> 0x02aa }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0223 A[Catch:{ Exception -> 0x02aa }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r2 = r23
                int r0 = r2.label
                if (r0 != 0) goto L_0x02d0
                X.C30691eM.A01(r24)
                X.9yt r1 = r7
                com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r0 = r1.A01
                r22 = r0
                android.content.Context r9 = r5
                X.6z4 r0 = r8
                r21 = r0
                X.00H r0 = r1.A0E
                java.lang.Object r7 = X.C18070vi.A0E(r0)
                X.9l1 r7 = (X.C190489l1) r7
                X.9yt r8 = r7
                X.BAU r1 = r6
                X.9aU r6 = new X.9aU
                r6.<init>(r1, r8)
                X.9aT r3 = new X.9aT
                r3.<init>(r1, r8)
                java.lang.String r5 = "fetch_source"
                r2 = 0
                r0 = r21
                boolean r13 = X.AnonymousClass8BX.A1U(r9, r0, r7)
                java.lang.String r0 = "WfsNativeAuthManager/getSsoCredentials"
                X.C18070vi.A0d(r0, r2)
                boolean r4 = X.C196549vF.A00(r9)
                boolean r0 = X.C196549vF.A01(r9)
                java.lang.String r10 = "ig_v2"
                java.lang.String r9 = "fb"
                if (r0 == 0) goto L_0x004e
                if (r4 == 0) goto L_0x004c
                java.lang.String r4 = "fb_ig_v2"
                goto L_0x004f
            L_0x004c:
                r4 = r10
                goto L_0x004f
            L_0x004e:
                r4 = r9
            L_0x004f:
                r0 = r22
                X.00H r0 = r0.A01     // Catch:{ Exception -> 0x02aa }
                r20 = r0
                java.lang.Object r14 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r14 = (X.C189979kA) r14     // Catch:{ Exception -> 0x02aa }
                int r12 = r4.hashCode()     // Catch:{ Exception -> 0x02aa }
                r0 = 3260(0xcbc, float:4.568E-42)
                r11 = 551497305(0x20df2e59, float:3.780834E-19)
                if (r12 == r0) goto L_0x00a0
                r0 = 3358(0xd1e, float:4.706E-42)
                if (r12 == r0) goto L_0x0093
                r0 = 97213313(0x5cb5b81, float:1.9123641E-35)
                if (r12 == r0) goto L_0x0086
                r0 = 100133181(0x5f7e93d, float:2.3313447E-35)
                if (r12 == r0) goto L_0x00ab
                r0 = 1273945082(0x4beedbfa, float:3.1307764E7)
                if (r12 != r0) goto L_0x00b8
                java.lang.String r0 = "fb_ig_v2"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x00b8
                X.19T r14 = r14.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_ig_v2_start"
                goto L_0x00b5
            L_0x0086:
                java.lang.String r0 = "fb_ig"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x00b8
                X.19T r14 = r14.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_ig_start"
                goto L_0x00b5
            L_0x0093:
                java.lang.String r0 = "ig"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x00b8
                X.19T r14 = r14.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_ig_start"
                goto L_0x00b5
            L_0x00a0:
                boolean r0 = r4.equals(r9)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x00b8
                X.19T r14 = r14.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_start"
                goto L_0x00b5
            L_0x00ab:
                boolean r0 = r4.equals(r10)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x00b8
                X.19T r14 = r14.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_ig_v2_start"
            L_0x00b5:
                r14.markerPoint(r11, r0)     // Catch:{ Exception -> 0x02aa }
            L_0x00b8:
                java.lang.String r0 = "WfsNativeAuthManager/getSsoList from cache"
                X.C18070vi.A0d(r0, r2)     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r0 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r0 = (X.C189979kA) r0     // Catch:{ Exception -> 0x02aa }
                java.lang.String r14 = "prefetch_auth"
                X.19T r11 = r0.A01     // Catch:{ Exception -> 0x02aa }
                r0 = 551497305(0x20df2e59, float:3.780834E-19)
                r11.markerAnnotate((int) r0, (java.lang.String) r14, (boolean) r13)     // Catch:{ Exception -> 0x02aa }
                X.BAU r0 = r6.A00     // Catch:{ Exception -> 0x02aa }
                com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r0 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r0     // Catch:{ Exception -> 0x02aa }
                X.00H r0 = r0.A03     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x02a3
                X.9nK r13 = X.AnonymousClass8BX.A0J(r0)     // Catch:{ Exception -> 0x02aa }
                X.C18070vi.A0X(r13)     // Catch:{ Exception -> 0x02aa }
            L_0x00dc:
                boolean r0 = r13.A02     // Catch:{ Exception -> 0x02aa }
                if (r0 != 0) goto L_0x00dc
                r0 = 19
                X.Alb r11 = new X.Alb     // Catch:{ Exception -> 0x02aa }
                r11.<init>(r13, r0)     // Catch:{ Exception -> 0x02aa }
                r0 = 3
                java.lang.Object r18 = X.C20017A3j.A00(r11, r0)     // Catch:{ Exception -> 0x02aa }
                r0 = r18
                java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x02aa }
                r18 = r0
                if (r0 != 0) goto L_0x00f6
                X.0wS r18 = X.C18460wS.A00     // Catch:{ Exception -> 0x02aa }
            L_0x00f6:
                boolean r0 = X.AnonymousClass000.A1a(r18)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x01dd
                java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x02aa }
                java.util.Iterator r17 = r18.iterator()     // Catch:{ Exception -> 0x02aa }
            L_0x0104:
                boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0142
                java.lang.Object r15 = r17.next()     // Catch:{ Exception -> 0x02aa }
                r13 = r15
                X.9oD r13 = (X.C192339oD) r13     // Catch:{ Exception -> 0x02aa }
                X.A0y r0 = r13.A01     // Catch:{ Exception -> 0x02aa }
                X.AiO r0 = r0.A02     // Catch:{ Exception -> 0x02aa }
                java.lang.String r14 = r0.ssoEligibility     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "0"
                boolean r16 = X.C18070vi.A18(r14, r0)     // Catch:{ Exception -> 0x02aa }
                X.9oe r0 = r13.A00     // Catch:{ Exception -> 0x02aa }
                X.Bzv r14 = r0.A03     // Catch:{ Exception -> 0x02aa }
                X.C18070vi.A0X(r14)     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r13 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r13 = (X.C189979kA) r13     // Catch:{ Exception -> 0x02aa }
                X.Bzv r0 = X.C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER     // Catch:{ Exception -> 0x02aa }
                r19 = r9
                if (r14 != r0) goto L_0x0132
                r19 = r10
            L_0x0132:
                X.19T r14 = r13.A01     // Catch:{ Exception -> 0x02aa }
                r13 = 551497305(0x20df2e59, float:3.780834E-19)
                r0 = r19
                r14.markerAnnotate((int) r13, (java.lang.String) r5, (java.lang.String) r0)     // Catch:{ Exception -> 0x02aa }
                if (r16 == 0) goto L_0x0104
                r11.add(r15)     // Catch:{ Exception -> 0x02aa }
                goto L_0x0104
            L_0x0142:
                java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x02aa }
                java.util.Iterator r18 = r18.iterator()     // Catch:{ Exception -> 0x02aa }
            L_0x014a:
                boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x018b
                java.lang.Object r17 = r18.next()     // Catch:{ Exception -> 0x02aa }
                r14 = r17
                X.9oD r14 = (X.C192339oD) r14     // Catch:{ Exception -> 0x02aa }
                X.A0y r0 = r14.A01     // Catch:{ Exception -> 0x02aa }
                X.AiO r0 = r0.A02     // Catch:{ Exception -> 0x02aa }
                java.lang.String r15 = r0.ntaEligibility     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "0"
                boolean r16 = X.C18070vi.A18(r15, r0)     // Catch:{ Exception -> 0x02aa }
                X.9oe r0 = r14.A00     // Catch:{ Exception -> 0x02aa }
                X.Bzv r15 = r0.A03     // Catch:{ Exception -> 0x02aa }
                X.C18070vi.A0X(r15)     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r14 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r14 = (X.C189979kA) r14     // Catch:{ Exception -> 0x02aa }
                X.Bzv r0 = X.C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER     // Catch:{ Exception -> 0x02aa }
                r19 = r9
                if (r15 != r0) goto L_0x0179
                r19 = r10
            L_0x0179:
                X.19T r15 = r14.A01     // Catch:{ Exception -> 0x02aa }
                r14 = 551497305(0x20df2e59, float:3.780834E-19)
                r0 = r19
                r15.markerAnnotate((int) r14, (java.lang.String) r5, (java.lang.String) r0)     // Catch:{ Exception -> 0x02aa }
                if (r16 == 0) goto L_0x014a
                r0 = r17
                r13.add(r0)     // Catch:{ Exception -> 0x02aa }
                goto L_0x014a
            L_0x018b:
                java.lang.Object r15 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r15 = (X.C189979kA) r15     // Catch:{ Exception -> 0x02aa }
                r0 = 3260(0xcbc, float:4.568E-42)
                r14 = 551497305(0x20df2e59, float:3.780834E-19)
                if (r12 == r0) goto L_0x01d2
                r0 = 3358(0xd1e, float:4.706E-42)
                if (r12 == r0) goto L_0x01c5
                r0 = 97213313(0x5cb5b81, float:1.9123641E-35)
                if (r12 == r0) goto L_0x01b8
                r0 = 100133181(0x5f7e93d, float:2.3313447E-35)
                if (r12 == r0) goto L_0x01fb
                r0 = 1273945082(0x4beedbfa, float:3.1307764E7)
                if (r12 != r0) goto L_0x0208
                java.lang.String r0 = "fb_ig_v2"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0208
                X.19T r9 = r15.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_ig_v2_end"
                goto L_0x0205
            L_0x01b8:
                java.lang.String r0 = "fb_ig"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0208
                X.19T r9 = r15.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_ig_end"
                goto L_0x0205
            L_0x01c5:
                java.lang.String r0 = "ig"
                boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0208
                X.19T r9 = r15.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_ig_end"
                goto L_0x0205
            L_0x01d2:
                boolean r0 = r4.equals(r9)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0208
                X.19T r9 = r15.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_fb_end"
                goto L_0x0205
            L_0x01dd:
                java.lang.Object r0 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r0 = (X.C189979kA) r0     // Catch:{ Exception -> 0x02aa }
                X.19T r1 = r0.A01     // Catch:{ Exception -> 0x02aa }
                r0 = 551497305(0x20df2e59, float:3.780834E-19)
                r1.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r0 = r20.get()     // Catch:{ Exception -> 0x02aa }
                X.9kA r0 = (X.C189979kA) r0     // Catch:{ Exception -> 0x02aa }
                r0.A00(r4)     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "sso list is empty"
                java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x02aa }
                goto L_0x021a
            L_0x01fb:
                boolean r0 = r4.equals(r10)     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0208
                X.19T r9 = r15.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = "fetch_auth_ig_v2_end"
            L_0x0205:
                r9.markerPoint(r14, r0)     // Catch:{ Exception -> 0x02aa }
            L_0x0208:
                boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0223
                boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x02aa }
                if (r0 == 0) goto L_0x0223
                java.lang.String r0 = "Not eligible for wfs or nta"
                java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x02aa }
            L_0x021a:
                X.9yt r1 = r3.A01     // Catch:{ Exception -> 0x02aa }
                X.BAU r0 = r3.A00     // Catch:{ Exception -> 0x02aa }
                X.C198779yt.A00(r0, r1, r2)     // Catch:{ Exception -> 0x02aa }
                goto L_0x02cd
            L_0x0223:
                boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x02aa }
                java.lang.String r9 = "XFamilySourceAccessPair"
                if (r0 == 0) goto L_0x0264
                java.lang.Object r0 = r13.get(r2)     // Catch:{ Exception -> 0x02aa }
                X.9oD r0 = (X.C192339oD) r0     // Catch:{ Exception -> 0x02aa }
                X.9oe r0 = r0.A00     // Catch:{ Exception -> 0x02aa }
                X.Bzv r6 = r0.A03     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r0 = r13.get(r2)     // Catch:{ Exception -> 0x02aa }
                X.9oD r0 = (X.C192339oD) r0     // Catch:{ Exception -> 0x02aa }
                X.A0y r0 = r0.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x02aa }
                X.1D6 r2 = X.AnonymousClass1D6.A01(r6, r0)     // Catch:{ Exception -> 0x02aa }
                X.7Ik r0 = X.AnonymousClass8BR.A0Z()     // Catch:{ Exception -> 0x02aa }
                X.77e r6 = new X.77e     // Catch:{ Exception -> 0x02aa }
                r6.<init>(r0, r2, r9)     // Catch:{ Exception -> 0x02aa }
                r2 = 4
                X.77S r0 = new X.77S     // Catch:{ Exception -> 0x02aa }
                r0.<init>(r6, r2)     // Catch:{ Exception -> 0x02aa }
                X.9pQ r7 = new X.9pQ     // Catch:{ Exception -> 0x02aa }
                r7.<init>(r0)     // Catch:{ Exception -> 0x02aa }
                X.1KB r6 = r8.A00     // Catch:{ Exception -> 0x02aa }
                r2 = 38
                X.AkI r0 = new X.AkI     // Catch:{ Exception -> 0x02aa }
                r0.<init>(r1, r7, r2)     // Catch:{ Exception -> 0x02aa }
                r6.CGP(r0)     // Catch:{ Exception -> 0x02aa }
                goto L_0x02cd
            L_0x0264:
                java.lang.String r0 = "WfsNativeAuthManager/getSsoCredentials Finished fetching data from app"
                X.C18070vi.A0d(r0, r2)     // Catch:{ Exception -> 0x02aa }
                r1 = 11404(0x2c8c, float:1.598E-41)
                r0 = r21
                boolean r0 = r0.A02(r1)     // Catch:{ Exception -> 0x02aa }
                if (r0 != 0) goto L_0x02cd
                java.lang.Object r0 = r11.get(r2)     // Catch:{ Exception -> 0x02aa }
                X.9oD r0 = (X.C192339oD) r0     // Catch:{ Exception -> 0x02aa }
                X.9oe r0 = r0.A00     // Catch:{ Exception -> 0x02aa }
                X.Bzv r1 = r0.A03     // Catch:{ Exception -> 0x02aa }
                java.lang.Object r0 = r11.get(r2)     // Catch:{ Exception -> 0x02aa }
                X.9oD r0 = (X.C192339oD) r0     // Catch:{ Exception -> 0x02aa }
                X.A0y r0 = r0.A01     // Catch:{ Exception -> 0x02aa }
                java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x02aa }
                X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)     // Catch:{ Exception -> 0x02aa }
                X.7Ik r0 = X.AnonymousClass8BR.A0Z()     // Catch:{ Exception -> 0x02aa }
                X.77e r8 = new X.77e     // Catch:{ Exception -> 0x02aa }
                r8.<init>(r0, r1, r9)     // Catch:{ Exception -> 0x02aa }
                r0 = 3
                X.77S r1 = new X.77S     // Catch:{ Exception -> 0x02aa }
                r1.<init>(r8, r0)     // Catch:{ Exception -> 0x02aa }
                X.9pQ r0 = new X.9pQ     // Catch:{ Exception -> 0x02aa }
                r0.<init>(r1)     // Catch:{ Exception -> 0x02aa }
                r7.A00(r3, r6, r0, r2)     // Catch:{ Exception -> 0x02aa }
                goto L_0x02cd
            L_0x02a3:
                java.lang.String r0 = "wfsBridgeFactory"
                X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x02aa }
                r0 = 0
                throw r0     // Catch:{ Exception -> 0x02aa }
            L_0x02aa:
                r6 = move-exception
                r0 = r22
                X.00H r2 = r0.A01
                java.lang.Object r0 = r2.get()
                X.9kA r0 = (X.C189979kA) r0
                X.19T r1 = r0.A01
                r0 = 551497305(0x20df2e59, float:3.780834E-19)
                r1.markerAnnotate((int) r0, (java.lang.String) r5, (java.lang.String) r4)
                java.lang.Object r0 = r2.get()
                X.9kA r0 = (X.C189979kA) r0
                r0.A00(r4)
                X.9yt r1 = r3.A01
                X.BAU r0 = r3.A00
                X.C198779yt.A00(r0, r1, r6)
            L_0x02cd:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x02d0:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.WfsManager$startWfs$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsManager$startWfs$1(Context context, BAU bau, C198779yt r4, C139576z4 r5, C30391dr r6) {
        super(2, r6);
        this.$abOfflineProps = r5;
        this.this$0 = r4;
        this.$context = context;
        this.$listener = bau;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C139576z4 r4 = this.$abOfflineProps;
        return new WfsManager$startWfs$1(this.$context, this.$listener, this.this$0, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A03 = C17890vO.A03(this.$abOfflineProps.A01(6982));
            final C198779yt r7 = this.this$0;
            final Context context = this.$context;
            final C139576z4 r8 = this.$abOfflineProps;
            final BAU bau = this.$listener;
            AnonymousClass1 r4 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass4Z5.A00(this, r4, A03) == r3) {
                return r3;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Exception unused) {
                Log.w(C31081ez.A00("WfsManager launchWfsFlow timeout"));
                ((C189979kA) this.this$0.A0D.get()).A00(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                this.this$0.A00.CGP(new C21446AkD(this.$listener, 8));
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsManager$startWfs$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
