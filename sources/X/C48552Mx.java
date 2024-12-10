package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2Mx  reason: invalid class name and case insensitive filesystem */
public class C48552Mx extends C59662mg {
    public final AnonymousClass37L A00;
    public final C31271fI A01;
    public final C31411fW A02;
    public final C31321fN A03;
    public final List A04;

    public C48552Mx(AnonymousClass190 r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass37L r10, C31271fI r11, C31411fW r12, C31321fN r13, List list, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r11;
        this.A03 = r13;
        this.A02 = r12;
        this.A04 = list;
        this.A00 = r10;
    }

    public void A01(C29621ca r15) {
        AnonymousClass3LB r9;
        Message message;
        C54472eC r3;
        AnonymousClass3LB r1;
        int i;
        long j;
        C54472eC r32;
        HashSet hashSet;
        Long l;
        C29621ca[] r33;
        C59132lo r2;
        int i2 = 0;
        C29621ca A0J = r15.A0J(0);
        if (C29621ca.A07(A0J, "offline_preview")) {
            A0J.A0A("count", 0);
            int A0A = A0J.A0A("message", 0);
            int A0A2 = A0J.A0A("receipt", 0);
            int A0A3 = A0J.A0A("status", 0);
            int A0A4 = A0J.A0A("notification", 0);
            int A0A5 = A0J.A0A("call", 0);
            C31411fW r34 = this.A02;
            if (C18020vd.A05(C18040vf.A01, r34.A0B, 4353)) {
                synchronized (r34) {
                    int i3 = r34.A00 + 1;
                    r34.A00 = i3;
                    if (i3 > 1) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("OfflineResumeMetrics/onOfflinePreview multiple preview count=");
                        A10.append(i3);
                        C17890vO.A1B(A10, ", ignoring");
                    } else if (A0A + A0A2 + A0A4 + A0A5 != 0) {
                        C59132lo r0 = r34.A08;
                        if (r0 == null) {
                            r34.A05 = r34.A07;
                            UUID randomUUID = UUID.randomUUID();
                            C18070vi.A0X(randomUUID);
                            r2 = new C59132lo(randomUUID, 1);
                        } else {
                            r2 = new C59132lo(r0.A01, r0.A00 + 1);
                        }
                        r34.A08 = r2;
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("OfflineResumeMetrics/onOfflinePreview offline newAttemptKey=");
                        A102.append(r2);
                        A102.append(" attempts=");
                        Map map = r34.A0D;
                        C17900vP.A0o(A102, map.size());
                        r34.A02 = 0;
                        r34.A04 = 0;
                        r34.A03 = 0;
                        r34.A01 = 0;
                        AnonymousClass2B0 r92 = (AnonymousClass2B0) AnonymousClass2BZ.DEFAULT_INSTANCE.A0N();
                        String obj = r2.A01.toString();
                        AnonymousClass2BZ A0W = C17880vN.A0W(r92);
                        obj.getClass();
                        A0W.bitField0_ |= 1;
                        A0W.sessionId_ = obj;
                        int i4 = r2.A00;
                        AnonymousClass2BZ A0W2 = C17880vN.A0W(r92);
                        A0W2.bitField0_ |= 2;
                        A0W2.attemptNumber_ = i4;
                        C45542Am r12 = (C45542Am) AnonymousClass2BJ.DEFAULT_INSTANCE.A0N();
                        AnonymousClass2BJ r13 = (AnonymousClass2BJ) C17880vN.A0G(r12);
                        r13.bitField0_ |= 1;
                        r13.messages_ = A0A;
                        AnonymousClass2BJ r14 = (AnonymousClass2BJ) C17880vN.A0G(r12);
                        r14.bitField0_ |= 2;
                        r14.receipts_ = A0A2;
                        AnonymousClass2BJ r16 = (AnonymousClass2BJ) C17880vN.A0G(r12);
                        r16.bitField0_ |= 4;
                        r16.notifications_ = A0A4;
                        AnonymousClass2BJ r17 = (AnonymousClass2BJ) C17880vN.A0G(r12);
                        r17.bitField0_ |= 8;
                        r17.calls_ = A0A5;
                        AnonymousClass2BZ A0W3 = C17880vN.A0W(r92);
                        AnonymousClass2BJ r02 = (AnonymousClass2BJ) r12.A0C();
                        r02.getClass();
                        A0W3.expected_ = r02;
                        A0W3.bitField0_ |= 4;
                        long j2 = r34.A06;
                        AnonymousClass2BZ A0W4 = C17880vN.A0W(r92);
                        A0W4.bitField0_ |= 16;
                        A0W4.connectServerTimeMillis_ = j2;
                        long j3 = r34.A07;
                        AnonymousClass2BZ A0W5 = C17880vN.A0W(r92);
                        A0W5.bitField0_ |= 32;
                        A0W5.connectUptimeMillis_ = j3;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        AnonymousClass2BZ A0W6 = C17880vN.A0W(r92);
                        A0W6.bitField0_ |= 64;
                        A0W6.offlinePreviewUptimeMillis_ = uptimeMillis;
                        boolean z = r34.A0A.A00;
                        AnonymousClass2BZ A0W7 = C17880vN.A0W(r92);
                        A0W7.bitField0_ |= 128;
                        A0W7.startedOnForeground_ = z;
                        long j4 = r34.A05;
                        AnonymousClass2BZ A0W8 = C17880vN.A0W(r92);
                        A0W8.bitField0_ |= 256;
                        A0W8.firstAttemptConnectUptimeMillis_ = j4;
                        AnonymousClass2BZ A0W9 = C17880vN.A0W(r92);
                        A0W9.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                        A0W9.oldestStanzaTimeMillis_ = Long.MAX_VALUE;
                        AnonymousClass2BZ A0W10 = C17880vN.A0W(r92);
                        A0W10.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                        A0W10.isOfflineCompleteReceived_ = false;
                        AnonymousClass2BZ A0W11 = C17880vN.A0W(r92);
                        A0W11.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                        A0W11.onTrickleMode_ = false;
                        AnonymousClass2BZ A0W12 = C17880vN.A0W(r92);
                        A0W12.bitField0_ |= 16384;
                        A0W12.disconnected_ = false;
                        Long l2 = r34.A09;
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            AnonymousClass2BZ A0W13 = C17880vN.A0W(r92);
                            A0W13.bitField0_ |= 512;
                            A0W13.activeModeUptimeMillis_ = longValue;
                        }
                        map.put(r2, r92);
                    } else if (r34.A08 != null) {
                        r34.A05 = 0;
                        r34.A08 = null;
                    }
                }
            }
            AnonymousClass37L r22 = this.A00;
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("ConnectionThreadRequestsImpl/offline-preview messages=");
            A103.append(A0A);
            A103.append("; receipts = ");
            A103.append(A0A2);
            A103.append("; calls = ");
            A103.append(A0A5);
            A103.append("; status = ");
            A103.append(A0A3);
            C17900vP.A0j("; notifications = ", A103, A0A4);
            r9 = r22.A00;
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("callCount", A0A5);
            A0D.putInt("messageCount", A0A);
            A0D.putInt("receiptCount", A0A2);
            A0D.putInt("statusCount", A0A3);
            A0D.putInt("notificationCount", A0A4);
            message = Message.obtain((Handler) null, 0, 259, 0, A0D);
        } else if (C29621ca.A07(A0J, "offline")) {
            int A0A6 = A0J.A0A("count", 0);
            C31411fW r35 = this.A02;
            C59132lo r23 = null;
            if (C18020vd.A05(C18040vf.A01, r35.A0B, 4353)) {
                synchronized (r35) {
                    C59132lo r7 = r35.A08;
                    if (r7 != null) {
                        if (r35.A02 + r35.A04 + r35.A03 + r35.A01 == 0) {
                            Log.i("OfflineResumeMetrics/onOfflineCompleteReceived no offline stanzas received");
                            C41681wt.A03(r35.A0D).remove(r35.A08);
                            if (r35.A08 != null) {
                                r35.A05 = 0;
                                r35.A08 = null;
                            }
                        } else {
                            Map map2 = r35.A0D;
                            AnonymousClass2B0 r03 = (AnonymousClass2B0) map2.get(r7);
                            if (r03 != null) {
                                AnonymousClass2BZ A0W14 = C17880vN.A0W(r03);
                                int i5 = AnonymousClass2BZ.ACTIVE_MODE_UPTIME_MILLIS_FIELD_NUMBER;
                                A0W14.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                                A0W14.isOfflineCompleteReceived_ = true;
                            }
                            AnonymousClass2B0 r04 = (AnonymousClass2B0) map2.get(r35.A08);
                            if (r04 != null) {
                                C31411fW.A01(r35, r04);
                            }
                        }
                        r35.A02 = 0;
                        r35.A04 = 0;
                        r35.A03 = 0;
                        r35.A01 = 0;
                        r23 = r35.A08;
                    }
                }
            }
            AnonymousClass37L r36 = this.A00;
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("ConnectionThreadRequestsImpl/onOfflineCompleteReceived key=");
            A104.append(r23);
            C17900vP.A0j(", count=", A104, A0A6);
            C17890vO.A0p(r36.A00, new C53572ck(r23, A0A6), 15);
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("onOfflineCompleteReceived");
            }
            return;
        } else {
            if (C29621ca.A07(A0J, "dirty")) {
                AnonymousClass37L r4 = this.A00;
                C29621ca[] r18 = r15.A02;
                C17960vV.A07(r18);
                C17960vV.A0C(C17890vO.A1R(r18.length));
                C29621ca r19 = r18[0];
                C17960vV.A0C(C29621ca.A07(r19, "dirty"));
                String A022 = C29621ca.A02(r19, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                C17960vV.A07(A022);
                if ("account_sync".equals(A022) && (r33 = r19.A02) != null) {
                    HashSet A12 = C17880vN.A12();
                    for (C29621ca r05 : r33) {
                        A12.add(r05.A00);
                    }
                    hashSet = A12;
                } else if ("syncd_app_state".equals(A022)) {
                    String A023 = C29621ca.A02(r19, "timestamp");
                    if (A023 != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(A023));
                        } catch (Exception unused) {
                            C17900vP.A0e("Timestamp is not a number: ", A023, AnonymousClass000.A10());
                        }
                        r32 = new C54472eC(l, A022, Collections.emptySet());
                        StringBuilder A105 = AnonymousClass000.A10();
                        A105.append("onDirty/category=");
                        C17890vO.A1A(A105, r32.A01);
                        r1 = r4.A00;
                        i = 8;
                        r3 = r32;
                    }
                    l = null;
                    r32 = new C54472eC(l, A022, Collections.emptySet());
                    StringBuilder A1052 = AnonymousClass000.A10();
                    A1052.append("onDirty/category=");
                    C17890vO.A1A(A1052, r32.A01);
                    r1 = r4.A00;
                    i = 8;
                    r3 = r32;
                } else {
                    hashSet = Collections.emptySet();
                }
                r32 = new C54472eC((Long) null, A022, hashSet);
                StringBuilder A10522 = AnonymousClass000.A10();
                A10522.append("onDirty/category=");
                C17890vO.A1A(A10522, r32.A01);
                r1 = r4.A00;
                i = 8;
                r3 = r32;
            } else if (C29621ca.A07(A0J, "streamdebug")) {
                String A0Q = A0J.A0Q("ip", (String) null);
                String A0Q2 = A0J.A0Q("reconnect", (String) null);
                String A0Q3 = A0J.A0Q("stanzalogcount", (String) null);
                if (A0Q3 != null) {
                    i2 = Integer.parseInt(A0Q3);
                }
                boolean equals = "1".equals(A0Q2);
                StringBuilder A106 = AnonymousClass000.A10();
                A106.append("ConnectionThreadRequestsImpl/stream/debug host=");
                A106.append(A0Q);
                A106.append(" reconnect=");
                A106.append(equals);
                C17900vP.A0j(" size=", A106, i2);
                return;
            } else if (C29621ca.A07(A0J, "location")) {
                Jid A0F = r15.A0F(UserJid.class, "from");
                if (A0J != null) {
                    C29621ca A0J2 = A0J.A0J(0);
                    if (A0J2 == null || !"enc".equals(A0J2.A00)) {
                        throw AnonymousClass1UI.A01("invalid location node");
                    }
                    C194059r6 A002 = AnonymousClass9RW.A00(A0J2);
                    String A024 = C29621ca.A02(A0J, "elapsed");
                    if (A024 != null) {
                        j = (long) Integer.parseInt(A024);
                    } else {
                        j = 0;
                    }
                    AnonymousClass37L r42 = this.A00;
                    C17900vP.A0Y(A0F, "ConnectionThreadRequestsImpl/on-location-update jid=", AnonymousClass000.A10());
                    AnonymousClass3LB r6 = r42.A00;
                    Message obtain = Message.obtain((Handler) null, 0, 117, 0, A002);
                    Bundle data = obtain.getData();
                    AnonymousClass2U5.A00(data, A0F, "jid");
                    data.putLong("elapsed", j);
                    r6.CAe(obtain);
                    return;
                }
                throw AnonymousClass1UI.A01("Missing location node");
            } else if (C29621ca.A07(A0J, "sonar")) {
                String A0P = A0J.A0P("url");
                AnonymousClass37L r24 = this.A00;
                C17900vP.A0f("ConnectionThreadRequestsImpl/sonar url=", A0P, AnonymousClass000.A10());
                r1 = r24.A00;
                i = 101;
                r3 = A0P;
            } else if (C29621ca.A07(A0J, "edge_routing")) {
                C29621ca A0K = A0J.A0K("routing_info");
                if (A0K != null && !TextUtils.isEmpty(A0K.A0M())) {
                    this.A03.A00(A0K.A01);
                    return;
                }
                return;
            } else if (C29621ca.A07(A0J, "fbip")) {
                String A0M = A0J.A0M();
                if (A0M != null) {
                    this.A01.A02(A0M.split(","));
                    return;
                }
                return;
            } else if (C29621ca.A07(A0J, "client_expiration")) {
                long A0D2 = A0J.A0D("t", -1);
                AnonymousClass37L r62 = this.A00;
                if (A0D2 != -1) {
                    A0D2 *= 1000;
                }
                Log.i("ConnectionThreadRequestsImpl/on-expiration-change");
                AnonymousClass3LB r43 = r62.A00;
                Bundle A0D3 = C17880vN.A0D();
                A0D3.putLong("timestampMs", A0D2);
                C17890vO.A0o(r43, A0D3, 159);
                return;
            } else if (C29621ca.A07(A0J, "gpia")) {
                C29621ca[] r44 = A0J.A02;
                if (r44 != null) {
                    int length = r44.length;
                    while (i2 < length) {
                        C29621ca r110 = r44[i2];
                        if (C29621ca.A07(r110, "request")) {
                            C17890vO.A0o(this.A00.A00, r110.A0P("nonce"), 254);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (C29621ca.A07(A0J, "safetynet")) {
                C29621ca[] r93 = A0J.A02;
                if (r93 != null) {
                    int length2 = r93.length;
                    while (i2 < length2) {
                        C29621ca r111 = r93[i2];
                        if (C29621ca.A07(r111, "integrity")) {
                            String A0P2 = r111.A0P("nonce");
                            AnonymousClass37L r112 = this.A00;
                            Log.i("ConnectionThreadRequestsImpl/on-attestation-request");
                            AnonymousClass3LB r37 = r112.A00;
                            Message obtain2 = Message.obtain((Handler) null, 0, 179, 0);
                            obtain2.getData().putString("nonce", A0P2);
                            r37.CAe(obtain2);
                        } else if (C29621ca.A07(r111, "verify_apps")) {
                            int A0B = r111.A0B(r111.A0P("count"), "count");
                            AnonymousClass37L r113 = this.A00;
                            Log.i("ConnectionThreadRequestsImpl/on-safetynet-verifyapps-request");
                            AnonymousClass3LB r38 = r113.A00;
                            Message obtain3 = Message.obtain((Handler) null, 0, 223, 0);
                            obtain3.getData().putInt("maxAppsCount", A0B);
                            r38.CAe(obtain3);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            } else if (C29621ca.A07(A0J, "peer_device_presence")) {
                AnonymousClass37L r45 = this.A00;
                boolean equalsIgnoreCase = "true".equalsIgnoreCase(A0J.A0P("presence"));
                C17900vP.A0n("ConnectionThreadRequestsImpl/on-peer-device-presence=", AnonymousClass000.A10(), equalsIgnoreCase);
                r9 = r45.A00;
                message = Message.obtain((Handler) null, 0, 215, equalsIgnoreCase ? 1 : 0);
            } else if (C29621ca.A07(A0J, "thread_metadata")) {
                this.A00.A01(r15, (Long) null, 257);
                return;
            } else {
                if (!C18020vd.A05(C18040vf.A02, this.A02, 366) && C29621ca.A07(A0J, "notice")) {
                    List A0R = r15.A0R("notice");
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it2 = A0R.iterator();
                    while (it2.hasNext()) {
                        C29621ca A0a = C17880vN.A0a(it2);
                        int A0B2 = A0a.A0B(A0a.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A0B3 = A0a.A0B(A0a.A0P("stage"), "stage");
                        long A0E = 1000 * A0a.A0E(A0a.A0P("t"), "t");
                        int A0B4 = A0a.A0B(A0a.A0P("version"), "version");
                        int A0A7 = A0a.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
                        if (A0A7 < 0 || A0A7 > 2 || A0B3 <= -1 || A0B3 >= 1000) {
                            C17900vP.A0k("ibstanzahandler/parseusernoticemetadatalist invalid user notice meta data id = ", AnonymousClass000.A10(), A0B2);
                        } else {
                            A13.add(new C63592tN(A0B2, A0B3, A0B4, A0E, A0A7));
                        }
                    }
                    AnonymousClass37L r114 = this.A00;
                    Log.i("ConnectionThreadRequestsImpl/on-user-notice-received");
                    r9 = r114.A00;
                    message = Message.obtain((Handler) null, 0, 216, 0, A13);
                } else if (C29621ca.A07(A0J, "tos")) {
                    this.A00.A01(A0J, (Long) null, 249);
                    return;
                } else {
                    return;
                }
            }
            C17890vO.A0o(r1, r3, i);
            return;
        }
        r9.CAe(message);
    }
}
