package X;

import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A8W {
    public static final int A0X = 3;
    public static final int A0Y = 30;
    public static final String A0Z = "MessagesImporter/";
    public final AnonymousClass190 A00;
    public final C25311Ns A01;
    public final C35191ln A02;
    public final C25111Mx A03;
    public final AnonymousClass1L7 A04;
    public final C19830z4 A05;
    public final AnonymousClass1LW A06;
    public final AnonymousClass1CJ A07;
    public final C26141Qz A08;
    public final AnonymousClass1MW A09;
    public final AnonymousClass1WM A0A;
    public final C18030ve A0B;
    public final C26061Qr A0C;
    public final C20048A4r A0D;
    public final AnonymousClass1Nb A0E;
    public final C25141Na A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I = C221618v.A00(C20029A3y.class);
    public final C218617r A0J;
    public final AnonymousClass1TK A0K;
    public final AnonymousClass11P A0L;
    public final C22621Co A0M;
    public final C28761ar A0N;
    public final C26111Qw A0O;
    public final AnonymousClass1WW A0P;
    public final AnonymousClass1NK A0Q;
    public final AnonymousClass1NJ A0R;
    public final A7Y A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;

    public static int A00(C165298au r3) {
        int i = 0;
        if (r3 == null) {
            return 0;
        }
        int i2 = r3.bitField0_;
        if ((i2 & 1) != 0 && r3.downloadImages_) {
            i = 1;
        }
        if ((i2 & 2) != 0 && r3.downloadAudio_) {
            i |= 2;
        }
        if ((i2 & 4) != 0 && r3.downloadVideo_) {
            i |= 4;
        }
        if ((i2 & 8) == 0 || !r3.downloadDocuments_) {
            return i;
        }
        return i | 8;
    }

    public AnonymousClass206 A08(C164658Zr r6) {
        if (r6 == null) {
            C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/failed");
            Log.e("MessagesImporter/Conversation message is null.");
            return null;
        }
        C166388co r3 = r6.message_;
        if (r3 == null) {
            r3 = C166388co.DEFAULT_INSTANCE;
        }
        try {
            return ((C192859p6) this.A0V.get()).A01(new C193069pU(AnonymousClass00R.A01), r3);
        } catch (Exception e) {
            C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/failed");
            A05(r3, "Failed to parse message from WMI.", e);
            return null;
        }
    }

    public void A0C(CancellationSignal cancellationSignal, C29691ci r9, B5M b5m, C166388co r11, AnonymousClass206 r12, byte[] bArr) {
        A0J(cancellationSignal, b5m, r11, r12, bArr);
        if (r12.A0v.A02) {
            A0M(r9, r11, r12);
        }
        if (AnonymousClass25A.A0X(this.A0C, r12, true)) {
            r9.A0I(r12);
            long j = r12.A0x;
            synchronized (r9) {
                r9.A0P = j;
            }
            long j2 = r12.A0y;
            synchronized (r9) {
                r9.A0Q = j2;
            }
            r9.A0G(r12.A0y);
            r9.A0F(r12.A0x);
            C49502Qs r1 = r12.A0J;
            if (r9.A0b == null) {
                r9.A0b = r1;
            }
        }
        if (r12.A0I > r9.A05()) {
            r9.A0H(r12.A0I);
        }
    }

    public void A0N(AnonymousClass1BI r13, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.A0M.A05((C49502Qs) null, r13, new C70573Bq(countDownLatch, 28), str, false);
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("MessagesImporter/Chat creation interrupted.", e);
        }
        if (countDownLatch.getCount() > 0) {
            throw new AnonymousClass9HZ(1, AnonymousClass001.A1E(r13, "Failed to create chat for ", AnonymousClass000.A10()));
        }
    }

    public static InputStream A03(String str, String str2) {
        File A17 = C108945cZ.A17(str);
        if (A17.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(C108945cZ.A18(A17));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (nextEntry.getName().equalsIgnoreCase(str2)) {
                        return zipInputStream;
                    }
                }
                try {
                    zipInputStream.close();
                } catch (IOException unused) {
                }
                StringBuilder A10 = AnonymousClass000.A10();
                C17900vP.A0c("Failed to find entry '", str2, "' in '", str, A10);
                throw new FileNotFoundException(AnonymousClass000.A0y("' archive.", A10));
            } catch (IOException e) {
                C17900vP.A0h(str, "' archive.", C17900vP.A0H("MessagesImporter/Failed to read entry '", str2, "' in '"), e);
                StringBuilder A102 = AnonymousClass000.A10();
                C17900vP.A0c("MessagesImporter/Failed to read entry '", str2, "' in '", str, A102);
                throw new IOException(AnonymousClass000.A0y("' archive.", A102), e);
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Unable to locate input data file '");
            A103.append(str);
            throw new FileNotFoundException(AnonymousClass000.A0y("'.", A103));
        }
    }

    private void A05(C166388co r6, String str, Throwable th) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        C166408cq r0 = r6.key_;
        if (r0 == null) {
            r0 = C166408cq.DEFAULT_INSTANCE;
        }
        objArr[1] = r0.id_;
        objArr[2] = r6.A0R();
        C17890vO.A1G(objArr, AnonymousClass8BR.A03(r6));
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", objArr);
        C17900vP.A0h(A0Z, format, AnonymousClass000.A10(), th);
        if (th != null) {
            this.A00.A0E("xpm-msg-importer-parsing-failed", AnonymousClass001.A1E(th, "; ex=", AnonymousClass000.A11(format)), th);
        } else {
            this.A00.A0G("xpm-msg-importer-parsing-failed", format, false);
        }
    }

    public C29691ci A07(CancellationSignal cancellationSignal, AnonymousClass1BI r21, B5M b5m, C166298cf r23, Map map, Map map2, byte[] bArr) {
        int i;
        int i2;
        long j;
        int i3;
        AnonymousClass9K1 r0;
        AnonymousClass1BI r15 = r21;
        C29691ci A0A2 = this.A07.A0A(r15);
        Boolean bool = null;
        long j2 = 0;
        int i4 = 0;
        C166298cf r5 = r23;
        if (A0A2 == null) {
            A0N(r15, r5.name_);
            if (C22971Dz.A0d(r15)) {
                int i5 = r5.bitField0_;
                if (!((262144 & i5) == 0 || (i5 & 524288) == 0)) {
                    this.A03.A07((UserJid) r15, r5.tcToken_.A06(), r5.tcTokenTimestamp_);
                }
            }
            if (C22971Dz.A0d(r15) && (r5.bitField0_ & 33554432) != 0) {
                this.A03.A0A((UserJid) r15, r5.tcTokenSenderTimestamp_);
            }
            if (r5.messages_.size() > 0) {
                C166388co r02 = ((C164658Zr) r5.messages_.get(0)).message_;
                if (r02 == null) {
                    r02 = C166388co.DEFAULT_INSTANCE;
                }
                j = r02.messageTimestamp_ * 1000;
            } else {
                j = 0;
            }
            A0A2 = this.A07.A0A(r15);
            if (A0A2 == null) {
                return null;
            }
            this.A06.A0M(A0A2.A07(Long.valueOf(j)), A0A2);
            A0E(cancellationSignal, r15, b5m, r5, bArr);
            if (r15 instanceof AnonymousClass1E9) {
                for (C164648Zq r1 : r5.participant_) {
                    UserJid A022 = C22941Dw.A02(r1.userJid_);
                    if (A022 != null) {
                        if ((r1.bitField0_ & 2) != 0) {
                            int i6 = r1.rank_;
                            if (i6 != 0) {
                                if (i6 == 1) {
                                    r0 = AnonymousClass9K1.ADMIN;
                                } else if (i6 == 2) {
                                    r0 = AnonymousClass9K1.SUPERADMIN;
                                }
                                i3 = r0.value;
                            }
                            r0 = AnonymousClass9K1.REGULAR;
                            i3 = r0.value;
                        } else {
                            i3 = 0;
                        }
                        this.A09.A0I(new C63312sr(A022, i3, true, true), (AnonymousClass1E9) r15);
                    }
                }
            }
        }
        if ((r5.bitField0_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            A0A2.A0D(0);
        } else if (r5.notSpam_) {
            A0A2.A0D(1);
        } else {
            A0A2.A0D(-1);
        }
        synchronized (A0A2) {
            A0A2.A01 = 1;
        }
        synchronized (A0A2) {
            A0A2.A0D = -1;
        }
        A0A2.A0H(r5.conversationTimestamp_ * 1000);
        if ((r5.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            String str = r5.name_;
            synchronized (A0A2) {
                A0A2.A0k = str;
            }
        }
        int i7 = r5.bitField0_;
        if ((i7 & 16384) != 0) {
            A0A2.A0l = r5.archived_;
        }
        A0A2.A0m = r5.locked_;
        if ((i7 & 128) != 0) {
            i = r5.ephemeralExpiration_;
        } else {
            i = 0;
        }
        if ((i7 & 256) != 0) {
            j2 = r5.ephemeralSettingTimestamp_;
        }
        if ((i7 & 32768) != 0) {
            C166328ci r03 = r5.disappearingMode_;
            C166328ci r6 = r03;
            if (r03 == null) {
                r03 = C166328ci.DEFAULT_INSTANCE;
            }
            i4 = Math.min(3, Math.max(0, r03.A0R().value));
            C166328ci r04 = r6;
            if (r6 == null) {
                r04 = C166328ci.DEFAULT_INSTANCE;
            }
            AnonymousClass9KQ A002 = AnonymousClass9KQ.A00(r04.trigger_);
            if (A002 == null) {
                A002 = AnonymousClass9KQ.UNKNOWN;
            }
            i2 = C196849vk.A00(A002);
            if (r6 == null) {
                r6 = C166328ci.DEFAULT_INSTANCE;
            }
            bool = Boolean.valueOf(r6.initiatedByMe_);
        } else {
            i2 = 0;
        }
        C29721cl r12 = A0A2.A0e;
        A0A2.A0E(Math.max(r12.expiration, i), Math.max(r12.ephemeralSettingTimestamp, j2), i4);
        if (C18020vd.A05(C18040vf.A02, this.A0B, 5309)) {
            A0A2.A0L(bool, i2);
        }
        map.put(r15, A0A2);
        map2.put(r15, r5);
        return A0A2;
    }

    public void A0A() {
        throw C17880vN.A0f("Unsupported build version.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        A0H(cancellationSignal, new AW6(this.A0S));
    }

    public void A0E(CancellationSignal cancellationSignal, AnonymousClass1BI r16, B5M b5m, C166298cf r18, byte[] bArr) {
        C166298cf r2 = r18;
        if ((r2.bitField0_ & 8388608) != 0) {
            AnonymousClass1BI r3 = r16;
            if (this.A0F.Bbh(r3, true) == null) {
                AnonymousClass8ZQ r5 = r2.wallpaper_;
                if (r5 == null) {
                    r5 = AnonymousClass8ZQ.DEFAULT_INSTANCE;
                }
                B5M b5m2 = b5m;
                byte[] bArr2 = bArr;
                A0F(cancellationSignal, r3, b5m2, r5, bArr2, false);
                A0F(cancellationSignal, r3, b5m2, r5, bArr2, true);
            }
        }
    }

    public void A0F(CancellationSignal cancellationSignal, AnonymousClass1BI r12, B5M b5m, AnonymousClass8ZQ r14, byte[] bArr, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        String str2 = r14.filename_;
        if (!TextUtils.isEmpty(str2)) {
            String A092 = this.A04.A09(C108945cZ.A17(str2));
            try {
                File A093 = A09(A092, 1, true);
                if (!A093.exists()) {
                    try {
                        A0L(cancellationSignal, b5m, A093, A092, bArr);
                        C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/file/success");
                    } catch (IOException e) {
                        e = e;
                        C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/file/failed");
                        sb = AnonymousClass000.A10();
                        str = "MessagesImporter/cannot import file for wallpaper, file=";
                        C17900vP.A0h(str, A092, sb, e);
                    }
                }
                if ((r14.bitField0_ & 2) != 0) {
                    i = r14.opacity_;
                } else {
                    i = 100;
                }
                try {
                    this.A0F.CGo(r12, new C85344Na(Integer.valueOf(i), "USER_PROVIDED", A093.getCanonicalPath()), z);
                } catch (IOException e2) {
                    e = e2;
                    sb = AnonymousClass000.A10();
                    str = "MessagesImporter/cannot get path for imported file, file=";
                    C17900vP.A0h(str, A092, sb, e);
                }
            } catch (IOException e3) {
                e = e3;
                sb = AnonymousClass000.A10();
                str = "MessagesImporter/cannot get corrected media file for wallpaper, file=";
                C17900vP.A0h(str, A092, sb, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        r17 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.os.CancellationSignal r26, X.C186029dX r27, X.B5M r28, java.lang.String r29) {
        /*
            r25 = this;
            java.lang.String r16 = "Failed to parse serialized messages file."
            java.lang.String r12 = "MessagesImporter/Failed to parse serialized messages file."
            r13 = r27
            java.util.List r0 = r13.A02
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00f5
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r11 = new byte[r0]
            java.util.List r0 = r13.A02
            int r10 = A01(r0)
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.HashMap r8 = X.C17880vN.A11()
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.String r0 = r13.A00
            r1 = r29
            java.io.InputStream r6 = A03(r1, r0)
            r5 = 0
            r4 = 0
        L_0x0031:
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00eb }
            int r0 = r0.size()     // Catch:{ all -> 0x00eb }
            r3 = r25
            if (r4 >= r0) goto L_0x00e1
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00eb }
            r0.get(r4)     // Catch:{ all -> 0x00eb }
            X.8cQ r0 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00cd }
            X.Bm6 r2 = X.C23577Bm6.A04(r0, r6)     // Catch:{ IOException -> 0x00cd }
            X.8cQ r2 = (X.C166148cQ) r2     // Catch:{ IOException -> 0x00cd }
            if (r2 == 0) goto L_0x00d9
            r18 = r26
            r20 = r28
            if (r4 != 0) goto L_0x0057
            r1 = r18
            r0 = r20
            r3.A0I(r1, r0, r2, r11)     // Catch:{ all -> 0x00eb }
        L_0x0057:
            r1 = 0
        L_0x0058:
            X.EE9 r0 = r2.conversations_     // Catch:{ all -> 0x00eb }
            int r0 = r0.size()     // Catch:{ all -> 0x00eb }
            if (r1 >= r0) goto L_0x00c9
            X.EE9 r0 = r2.conversations_     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00eb }
            X.8cf r0 = (X.C166298cf) r0     // Catch:{ all -> 0x00eb }
            boolean r14 = r3.A0V(r0)     // Catch:{ all -> 0x00eb }
            if (r14 == 0) goto L_0x008a
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00eb }
            java.lang.String r15 = "MessagesImporter/Skipping chat, messages count: "
            r14.append(r15)     // Catch:{ all -> 0x00eb }
            X.EE9 r0 = r0.messages_     // Catch:{ all -> 0x00eb }
            int r0 = r0.size()     // Catch:{ all -> 0x00eb }
            X.C17900vP.A0o(r14, r0)     // Catch:{ all -> 0x00eb }
            X.A3y r14 = X.AnonymousClass8BT.A0N(r3)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "import/chat/skipped"
            X.C20029A3y.A01(r14, r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00c6
        L_0x008a:
            java.lang.String r14 = r0.id_     // Catch:{ all -> 0x00eb }
            X.1BI r19 = X.AnonymousClass3MX.A0l(r14)     // Catch:{ all -> 0x00eb }
            if (r19 == 0) goto L_0x00c6
            r21 = r0
            r22 = r9
            r23 = r8
            r24 = r11
            r17 = r3
            X.1ci r19 = r17.A07(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00eb }
            if (r19 == 0) goto L_0x00c6
            X.EE9 r14 = r0.messages_     // Catch:{ all -> 0x00eb }
            r21 = r14
            r22 = r11
            r17.A0D(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00eb }
            r3.A0Q(r0, r7)     // Catch:{ all -> 0x00eb }
            X.EE9 r0 = r0.messages_     // Catch:{ all -> 0x00eb }
            int r0 = r0.size()     // Catch:{ all -> 0x00eb }
            int r5 = r5 + r0
            X.00H r0 = r3.A0H     // Catch:{ all -> 0x00eb }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x00eb }
            X.2Kh r15 = (X.C47872Kh) r15     // Catch:{ all -> 0x00eb }
            r14 = 2
            X.AWf r0 = new X.AWf     // Catch:{ all -> 0x00eb }
            r0.<init>(r5, r10, r14)     // Catch:{ all -> 0x00eb }
            r15.notifyAllObservers(r0)     // Catch:{ all -> 0x00eb }
        L_0x00c6:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x00c9:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x00cd:
            r1 = move-exception
            com.whatsapp.util.Log.e(r12, r1)     // Catch:{ all -> 0x00eb }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00eb }
            r0 = r16
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00eb }
            goto L_0x00e0
        L_0x00d9:
            com.whatsapp.util.Log.e((java.lang.String) r12)     // Catch:{ all -> 0x00eb }
            java.io.IOException r2 = X.C17880vN.A0f(r16)     // Catch:{ all -> 0x00eb }
        L_0x00e0:
            throw r2     // Catch:{ all -> 0x00eb }
        L_0x00e1:
            r6.close()
            r3.A06(r9, r8)
            r3.A0U(r7)
            return
        L_0x00eb:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00f0 }
            throw r1
        L_0x00f0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00f5:
            java.lang.String r0 = "MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "Messages chunks are not specified."
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8W.A0G(android.os.CancellationSignal, X.9dX, X.B5M, java.lang.String):void");
    }

    public void A0H(CancellationSignal cancellationSignal, B5M b5m) {
        InputStream A032;
        String absolutePath = ((AW6) b5m).A00.A06("migration/messages_export.zip").getAbsolutePath();
        try {
            A032 = A03(absolutePath, "header.json");
            C188009gj A022 = A02(A032);
            A032.close();
            C186029dX r2 = A022.A01;
            if (r2 != null && !TextUtils.isEmpty(r2.A00) && "protobuf".equalsIgnoreCase(r2.A01)) {
                A0G(cancellationSignal, r2, b5m, absolutePath);
                return;
            }
            return;
        } catch (IOException e) {
            throw new AnonymousClass9HZ("Unable to locate header metadata file in messages archive.", e, 202);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A0I(CancellationSignal cancellationSignal, B5M b5m, C166148cQ r16, byte[] bArr) {
        C166148cQ r1 = r16;
        if ((r1.bitField0_ & 8) != 0) {
            C166198cV r2 = r1.globalSettings_;
            if (r2 == null) {
                r2 = C166198cV.DEFAULT_INSTANCE;
            }
            CancellationSignal cancellationSignal2 = cancellationSignal;
            B5M b5m2 = b5m;
            byte[] bArr2 = bArr;
            if (AnonymousClass8BW.A1Q(r2.bitField0_)) {
                AnonymousClass8ZQ r10 = r2.lightThemeWallpaper_;
                if (r10 == null) {
                    r10 = AnonymousClass8ZQ.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (AnonymousClass1BI) null, b5m2, r10, bArr2, false);
            }
            if ((r2.bitField0_ & 4) != 0) {
                AnonymousClass8ZQ r102 = r2.darkThemeWallpaper_;
                if (r102 == null) {
                    r102 = AnonymousClass8ZQ.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (AnonymousClass1BI) null, b5m2, r102, bArr2, true);
            }
            if (AnonymousClass000.A1O(r2.bitField0_ & 2)) {
                AnonymousClass9KK A002 = AnonymousClass9KK.A00(r2.mediaVisibility_);
                if (A002 == null) {
                    A002 = AnonymousClass9KK.DEFAULT;
                }
                if (A002 != AnonymousClass9KK.DEFAULT) {
                    AnonymousClass1Nb r5 = this.A0E;
                    int i = 1;
                    if (AnonymousClass000.A1Z(A002, AnonymousClass9KK.ON)) {
                        i = 2;
                    }
                    C42551yM A012 = AnonymousClass1Nb.A01(r5, "individual_chat_defaults");
                    if (i != A012.A01) {
                        A012.A01 = i;
                        AnonymousClass1Nb.A07(A012, r5);
                    }
                }
            }
            if ((r2.bitField0_ & 8) != 0) {
                C19830z4 r12 = this.A05;
                C165298au r0 = r2.autoDownloadWiFi_;
                if (r0 == null) {
                    r0 = C165298au.DEFAULT_INSTANCE;
                }
                C17880vN.A1C(C19830z4.A00(r12), "autodownload_wifi_mask", A00(r0));
            }
            if ((r2.bitField0_ & 16) != 0) {
                C19830z4 r13 = this.A05;
                C165298au r02 = r2.autoDownloadCellular_;
                if (r02 == null) {
                    r02 = C165298au.DEFAULT_INSTANCE;
                }
                C17880vN.A1C(C19830z4.A00(r13), "autodownload_cellular_mask", A00(r02));
            }
            if ((r2.bitField0_ & 32) != 0) {
                C19830z4 r14 = this.A05;
                C165298au r03 = r2.autoDownloadRoaming_;
                if (r03 == null) {
                    r03 = C165298au.DEFAULT_INSTANCE;
                }
                C17880vN.A1C(C19830z4.A00(r14), "autodownload_roaming_mask", A00(r03));
            }
            if ((r2.bitField0_ & 64) != 0) {
                this.A0E.A0u(!r2.showIndividualNotificationsPreview_);
            }
            if ((r2.bitField0_ & 128) != 0) {
                this.A0E.A0t(true ^ r2.showGroupNotificationsPreview_);
            }
            if ((r2.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                AnonymousClass8ZN r04 = r2.avatarUserSettings_;
                if (r04 == null) {
                    r04 = AnonymousClass8ZN.DEFAULT_INSTANCE;
                }
                A0P(r04);
            }
            if ((r2.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                C17880vN.A1E(C19830z4.A00(this.A05), "interface_font_size", String.valueOf(r2.fontSize_));
            }
            if ((r2.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                C19830z4 r05 = this.A05;
                C17880vN.A1F(C19830z4.A00(r05), "security_notifications", r2.securityNotifications_);
            }
            if ((r2.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                C19830z4 r06 = this.A05;
                C17880vN.A1F(C19830z4.A00(r06), "notify_new_message_for_archived_chats", r2.autoUnarchiveChats_);
            }
            if ((r2.bitField0_ & 16384) != 0) {
                C19830z4 r07 = this.A05;
                C17880vN.A1C(C19830z4.A00(r07), "video_quality", r2.videoQualityMode_);
            }
            if ((r2.bitField0_ & 32768) != 0) {
                C19830z4 r08 = this.A05;
                C17880vN.A1C(C19830z4.A00(r08), "photo_quality", r2.photoQualityMode_);
            }
            if ((r2.bitField0_ & 65536) != 0) {
                C165708bd r09 = r2.individualNotificationSettings_;
                if (r09 == null) {
                    r09 = C165708bd.DEFAULT_INSTANCE;
                }
                A0S(r09);
            }
            if ((r2.bitField0_ & A7Y.A0F) != 0) {
                C165708bd r010 = r2.groupNotificationSettings_;
                if (r010 == null) {
                    r010 = C165708bd.DEFAULT_INSTANCE;
                }
                A0R(r010);
            }
            if ((r2.bitField0_ & 262144) != 0) {
                C164288Yg r011 = r2.chatLockSettings_;
                if (r011 == null) {
                    r011 = C164288Yg.DEFAULT_INSTANCE;
                }
                A0O(r011);
            }
        }
    }

    public void A0K(CancellationSignal cancellationSignal, B5M b5m, AnonymousClass21V r15, byte[] bArr) {
        File file;
        boolean z;
        C62572rc r3 = r15.A02;
        if (r3 != null && (file = r3.A0G) != null) {
            String A092 = this.A04.A09(file);
            File A093 = A09(A092, r15.A0u, r15.A0v.A02);
            if (!A093.exists()) {
                try {
                    A0L(cancellationSignal, b5m, A093, A092, bArr);
                    C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/file/success");
                } catch (IOException e) {
                    C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/file/failed");
                    C17900vP.A0h("MessagesImporter/processMediaMessage; cannot import file for message, file=", A092, AnonymousClass000.A10(), e);
                    z = true;
                }
            }
            z = false;
            if (!A093.exists() || z) {
                r3.A0G = null;
                r3.A0V = false;
                return;
            }
            this.A01.A06(A093, 1, true);
            r3.A0G = A093;
            r3.A0V = true;
        }
    }

    public void A0L(CancellationSignal cancellationSignal, B5M b5m, File file, String str, byte[] bArr) {
        this.A0D.A03(cancellationSignal, ((AW6) b5m).A00.A06(str), file, bArr);
    }

    public void A0M(C29691ci r24, C166388co r25, AnonymousClass206 r26) {
        HashSet hashSet;
        for (C165768bj r9 : r25.userReceipt_) {
            AnonymousClass206 r8 = r26;
            try {
                AnonymousClass1WW r13 = this.A0P;
                long j = r8.A0x;
                UserJid A022 = C22941Dw.A02(r9.userJid_);
                long j2 = r9.readTimestamp_ * 1000;
                r13.A02(A022, j, r9.receiptTimestamp_ * 1000, j2, r9.playedTimestamp_ * 1000);
            } catch (SQLiteConstraintException e) {
                Log.e("MessagesImporter/Failed to insert user receipt.", e);
                this.A00.A0E("xpm-failed-receipt-import", e.toString(), e);
            }
            if (r9.readTimestamp_ > 0) {
                long j3 = r8.A0x;
                C29691ci r2 = r24;
                synchronized (r2) {
                    r2.A0T = j3;
                }
                long j4 = r8.A0y;
                synchronized (r2) {
                    r2.A0U = j4;
                }
            }
            if (r9.pendingDeviceJid_.size() > 0) {
                hashSet = new HashSet(r9.pendingDeviceJid_.size());
                Iterator it = r9.pendingDeviceJid_.iterator();
                while (it.hasNext()) {
                    DeviceJid A062 = DeviceJid.Companion.A06(C17880vN.A0v(it));
                    if (A062 != null) {
                        hashSet.add(A062);
                    }
                }
            } else {
                hashSet = C17880vN.A12();
            }
            if (r9.deliveredDeviceJid_.size() > 0) {
                Iterator it2 = r9.deliveredDeviceJid_.iterator();
                while (it2.hasNext()) {
                    DeviceJid A063 = DeviceJid.Companion.A06(C17880vN.A0v(it2));
                    if (A063 != null) {
                        hashSet.remove(A063);
                        try {
                            this.A0O.A04(A063, r8, r8.A0I);
                        } catch (SQLiteConstraintException e2) {
                            Log.e("MessagesImporter/Failed to insert device receipt.", e2);
                            this.A00.A0E("xpm-failed-receipt-import", e2.toString(), e2);
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                try {
                    C26111Qw r1 = this.A0O;
                    C18070vi.A0d(r8, 0);
                    C26111Qw.A00(r1, r8).A08(r8, hashSet);
                } catch (SQLiteConstraintException e3) {
                    Log.e("MessagesImporter/Failed to insert blank device receipt.", e3);
                    this.A00.A0E("xpm-failed-receipt-import", e3.toString(), e3);
                }
            }
        }
    }

    public void A0O(C164288Yg r3) {
        this.A0K.A02(r3.hideLockedChats_);
        this.A0K.A03(true);
        C59992nD r1 = (C59992nD) this.A0U.get();
        C165328ax r0 = r3.secretCode_;
        if (r0 == null) {
            r0 = C165328ax.DEFAULT_INSTANCE;
        }
        r1.A03(r0);
    }

    public void A0P(AnonymousClass8ZN r6) {
        if (r6 != null) {
            int i = r6.bitField0_;
            if ((i & 1) != 0 && (i & 2) != 0) {
                C1418477e A0Y2 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), Long.class, C108965cb.A0m(r6.fbid_), "WaFbid");
                C1418477e A0Y3 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, r6.password_, "WaFbPassword");
                C136796uQ r3 = (C136796uQ) this.A0T.get();
                r3.A02(new C134906rL(A0Y2, A0Y3), new AnonymousClass7L9(r3, 1));
            }
        }
    }

    public void A0Q(C166298cf r8, Map map) {
        int i;
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(r8.id_);
        C17960vV.A07(A0l);
        if ((r8.bitField0_ & 2097152) != 0 && (i = r8.pinned_) > 0) {
            C17880vN.A1O(A0l, map, i);
        }
        if ((r8.bitField0_ & 4194304) != 0) {
            long j = r8.muteEndTime_;
            if (j > 0) {
                j *= 1000;
            }
            if (j != 0) {
                this.A0E.A0z(A0l, C32961i2.OTHER, j);
            }
        }
        if ((r8.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            AnonymousClass9KK A002 = AnonymousClass9KK.A00(r8.mediaVisibility_);
            if (A002 == null) {
                A002 = AnonymousClass9KK.DEFAULT;
            }
            if (A002 != AnonymousClass9KK.DEFAULT) {
                AnonymousClass1Nb r3 = this.A0E;
                int i2 = A002.value;
                r3.A0K.get();
                C42551yM A012 = AnonymousClass1Nb.A01(r3, A0l.getRawString());
                if (i2 != A012.A01) {
                    A012.A01 = i2;
                    AnonymousClass1Nb.A07(A012, r3);
                }
            }
        }
    }

    public void A0R(C165708bd r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                AnonymousClass1Nb.A0B(this.A0E, "group_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                AnonymousClass1Nb.A09(this.A0E, "group_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                AnonymousClass1Nb.A08(this.A0E, "group_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                this.A0E.A0t(r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1Nb r3 = this.A0E;
                boolean z = r5.reactionsMuted_;
                C42551yM A012 = AnonymousClass1Nb.A01(r3, "group_chat_defaults");
                if (z != A012.A0R) {
                    A012.A0R = z;
                    AnonymousClass1Nb.A07(A012, r3);
                }
            }
        }
    }

    public void A0S(C165708bd r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                AnonymousClass1Nb.A0B(this.A0E, "individual_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                AnonymousClass1Nb.A09(this.A0E, "individual_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                AnonymousClass1Nb.A08(this.A0E, "individual_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                this.A0E.A0u(r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1Nb r3 = this.A0E;
                boolean z = r5.reactionsMuted_;
                C42551yM A012 = AnonymousClass1Nb.A01(r3, "individual_chat_defaults");
                if (z != A012.A0R) {
                    A012.A0R = z;
                    AnonymousClass1Nb.A07(A012, r3);
                }
            }
            if ((r5.bitField0_ & 32) != 0) {
                AnonymousClass1Nb r32 = this.A0E;
                String str = r5.callVibrate_;
                C42551yM A013 = AnonymousClass1Nb.A01(r32, "individual_chat_defaults");
                if (!TextUtils.equals(str, A013.A0G)) {
                    A013.A0G = str;
                    AnonymousClass1Nb.A07(A013, r32);
                }
            }
        }
    }

    public void A0T(C436420i r3) {
        int i = r3.A00;
        if ((i == 11 || i == 167 || i == 9) && TextUtils.isEmpty(r3.A0P())) {
            AnonymousClass1CJ r1 = this.A07;
            AnonymousClass1BI r0 = r3.A0v.A00;
            C17960vV.A07(r0);
            r3.A0i(r1.A0F(r0));
        }
    }

    public void A0U(TreeMap treeMap) {
        long A012 = AnonymousClass11P.A01(this.A0L);
        for (Number number : treeMap.descendingKeySet()) {
            int intValue = number.intValue();
            Object obj = treeMap.get(number);
            C17960vV.A07(obj);
            this.A0E.A0c((AnonymousClass1BI) obj, A012 - ((long) intValue));
        }
    }

    public boolean A0V(C166298cf r5) {
        EE9<C164658Zr> ee9 = r5.messages_;
        if (ee9.size() <= 3) {
            for (C164658Zr A082 : ee9) {
                AnonymousClass206 A083 = A08(A082);
                if (A083 == null || (A083 instanceof C436420i)) {
                }
            }
            return true;
        }
        return false;
    }

    public A8W(AnonymousClass11P r2, C18030ve r3, AnonymousClass1LW r4, AnonymousClass190 r5, AnonymousClass1CJ r6, AnonymousClass1NK r7, C218617r r8, AnonymousClass1NJ r9, C22621Co r10, AnonymousClass1L7 r11, A7Y a7y, AnonymousClass00H r13, AnonymousClass1WW r14, AnonymousClass1Nb r15, C20048A4r a4r, AnonymousClass1WM r17, C25111Mx r18, C19830z4 r19, AnonymousClass00H r20, AnonymousClass1MW r21, C26111Qw r22, C26141Qz r23, C28761ar r24, C35191ln r25, C26061Qr r26, C25141Na r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass1TK r30, AnonymousClass00H r31, AnonymousClass00H r32, C25311Ns r33) {
        this.A0L = r2;
        this.A0B = r3;
        this.A06 = r4;
        this.A00 = r5;
        this.A07 = r6;
        this.A0Q = r7;
        this.A0J = r8;
        this.A0R = r9;
        this.A0M = r10;
        this.A04 = r11;
        this.A0S = a7y;
        this.A0G = r13;
        this.A0P = r14;
        this.A0E = r15;
        this.A0D = a4r;
        this.A0A = r17;
        this.A03 = r18;
        this.A05 = r19;
        this.A0V = r20;
        this.A09 = r21;
        this.A0O = r22;
        this.A08 = r23;
        this.A0N = r24;
        this.A02 = r25;
        this.A0C = r26;
        this.A0F = r27;
        this.A0H = r28;
        this.A0K = r30;
        this.A0W = r29;
        this.A0T = r31;
        this.A0U = r32;
        this.A01 = r33;
    }

    public static int A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + ((C184629bG) it.next()).A01);
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.9gj] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.9dX] */
    public static C188009gj A02(InputStream inputStream) {
        try {
            JSONObject A0x = AnonymousClass8BW.A0x(C181039Ox.A00(inputStream));
            JSONObject jSONObject = A0x.getJSONObject("header");
            ? obj = new Object();
            obj.A00 = jSONObject.getLong("creation_date");
            obj.A05 = jSONObject.getString("os");
            obj.A06 = jSONObject.getString("os_version");
            obj.A02 = jSONObject.getString("app_name");
            obj.A03 = jSONObject.getString("app_version");
            obj.A04 = jSONObject.getString("format_version");
            if (A0x.has("messages")) {
                JSONObject jSONObject2 = A0x.getJSONObject("messages");
                ? obj2 = new Object();
                obj2.A00 = jSONObject2.getString("filename");
                obj2.A01 = jSONObject2.getString("format");
                if (jSONObject2.has("chunks")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("chunks");
                    ArrayList A13 = AnonymousClass000.A13();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        C184629bG r2 = new C184629bG();
                        r2.A00 = jSONObject3.getInt("chunk_number");
                        r2.A01 = (long) jSONObject3.getInt("messages_count");
                        A13.add(r2);
                    }
                    obj2.A02 = A13;
                }
                obj.A01 = obj2;
            }
            return obj;
        } catch (IOException | JSONException e) {
            throw new IOException("Unable to parse JSON header.", e);
        }
    }

    private void A04(CancellationSignal cancellationSignal, File file) {
        FileOutputStream A19;
        if (file.exists()) {
            C193089pW r2 = (C193089pW) this.A0W.get();
            try {
                FileInputStream A18 = C108945cZ.A18(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(A18);
                    try {
                        byte[] bArr = new byte[A7Y.A0F];
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            cancellationSignal.throwIfCanceled();
                            A19 = C108945cZ.A19(r2.A00(nextEntry.getName()));
                            C20048A4r.A01(cancellationSignal, zipInputStream, A19, bArr);
                            A19.close();
                        }
                        zipInputStream.close();
                        A18.close();
                        return;
                    } catch (Throwable th) {
                        zipInputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A18.close();
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("MessagesImporter/Failed to unpack files from archive.", e);
                r2.A02();
                throw e;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0N(file, "Unable to locate input data file '", A10);
            throw new FileNotFoundException(AnonymousClass000.A0y("'.", A10));
        }
        throw th;
    }

    private void A06(Map map, Map map2) {
        int i;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            C29691ci r7 = (C29691ci) A16.getValue();
            C166298cf r2 = (C166298cf) map2.get(key);
            if (r2 != null) {
                int i2 = r2.bitField0_;
                if ((131072 & i2) != 0 && r2.markedAsUnread_) {
                    r7.A0K(-1, 0, 0, 0);
                } else if ((i2 & 16) != 0 && (i = r2.unreadCount_) > 0) {
                    long A042 = this.A0R.A04(this.A0Q.A05(r7.A08(), i));
                    int A032 = this.A0R.A03(r7.A08(), A042);
                    r7.A0K(this.A0R.A01(r7.A08(), A042) - A032, A032, i, this.A0N.A00(r7.A08(), A042));
                }
                this.A06.A0M(r7.A07((Long) null), r7);
            }
        }
    }

    public File A09(String str, int i, boolean z) {
        return C17880vN.A0e(this.A0J.A0K(i, 0, C72453Mb.A04(z ? 1 : 0)), C108945cZ.A17(str).getName());
    }

    public void A0D(CancellationSignal cancellationSignal, C29691ci r11, B5M b5m, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C164658Zr r0 = (C164658Zr) it.next();
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal.throwIfCanceled();
            AnonymousClass206 A082 = A08(r0);
            if (A082 != null) {
                C166388co r6 = r0.message_;
                if (r6 == null) {
                    r6 = C166388co.DEFAULT_INSTANCE;
                }
                A0C(cancellationSignal2, r11, b5m, r6, A082, bArr);
            }
        }
    }

    public void A0J(CancellationSignal cancellationSignal, B5M b5m, C166388co r7, AnonymousClass206 r8, byte[] bArr) {
        try {
            if (AnonymousClass206.A08(r8)) {
                this.A02.CBs(r7, r8);
            }
            r8.A0b(16384);
            if (r8 instanceof AnonymousClass21V) {
                A0K(cancellationSignal, b5m, (AnonymousClass21V) r8, bArr);
            } else if (r8 instanceof C436420i) {
                A0T((C436420i) r8);
            }
            AnonymousClass206 A0K2 = r8.A0K();
            if (A0K2 != null && (A0K2 instanceof AnonymousClass21V)) {
                A0K(cancellationSignal, b5m, (AnonymousClass21V) A0K2, bArr);
            }
            if (r8.A05 > 0) {
                this.A08.A05(r8, r8.A0I);
            }
            C17880vN.A0c(this.A0G).A04(r8);
            C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/success");
            this.A0A.A0I(r8);
        } catch (Exception e) {
            C20029A3y.A01(AnonymousClass8BT.A0N(this), "import/msg/failed");
            Log.e("MessagesImporter/Failed to insert message.", e);
            this.A00.A0E("xpm-msg-importer-insert-failed", AnonymousClass001.A1E(e, "Failed to insert message: ", AnonymousClass000.A10()), e);
        }
    }
}
