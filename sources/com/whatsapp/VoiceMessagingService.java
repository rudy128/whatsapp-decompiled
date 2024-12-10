package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass12L;
import X.AnonymousClass1BI;
import X.AnonymousClass1H3;
import X.AnonymousClass1H4;
import X.AnonymousClass1H5;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass2WR;
import X.C000100c;
import X.C000200d;
import X.C1408573i;
import X.C1409673t;
import X.C145887Mz;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C21455AkM;
import X.C21459AkQ;
import X.C217217d;
import X.C22941Dw;
import X.C22971Dz;
import X.C25491Ok;
import X.C26421Sb;
import X.C26521Sl;
import X.C27301Vn;
import X.C33251iW;
import X.C62572rc;
import X.C62952sG;
import X.C87454Vq;
import X.C88424Zq;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public AnonymousClass1H3 A00;
    public C33251iW A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1PM A03;
    public C25491Ok A04;
    public C27301Vn A05;
    public C18000vb A06;
    public C18030ve A07;
    public AnonymousClass12L A08;
    public C26421Sb A09;
    public C145887Mz A0A;
    public C26521Sl A0B;
    public final Handler A0C = C17890vO.A0D();

    public void attachBaseContext(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        this.A07 = A0H.BAL();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = (C33251iW) r1.ABA.get();
        this.A08 = (AnonymousClass12L) r1.A90.get();
        this.A09 = (C26421Sb) r1.A67.get();
        this.A02 = AnonymousClass10E.A4z(r1);
        this.A0B = (C26521Sl) r1.A69.get();
        this.A06 = A0H.CS9();
        this.A04 = (C25491Ok) r1.A1F.get();
        this.A0A = (C145887Mz) r1.AAx.get();
        this.A03 = (AnonymousClass1PM) r1.ABM.get();
        this.A05 = (C27301Vn) r1.A9A.get();
        AnonymousClass1H4 r4 = new AnonymousClass1H4((C18000vb) r1.Ao8.A00.AJU.ABz.get());
        this.A00 = r4;
        super.attachBaseContext(new AnonymousClass1H5(context, r4, this.A06, this.A07, C000200d.A00(r1.A9s)));
    }

    public void performAction(Intent intent, boolean z, Bundle bundle) {
        StringBuilder A10;
        Uri uri;
        String obj;
        if (!z) {
            obj = "VoiceMessagingService/ignoring unverified voice message";
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(stringExtra);
            if (C22971Dz.A0Y(A022) || C22971Dz.A0N(A022) || C22971Dz.A0e(A022)) {
                C18030ve r2 = this.A07;
                AnonymousClass1PM r1 = this.A03;
                UserJid A002 = C22941Dw.A00(A022);
                if (!C87454Vq.A01(r1, r2, this.A08, A002)) {
                    C18030ve r6 = this.A07;
                    AnonymousClass12L r7 = this.A08;
                    if (!C88424Zq.A00(this.A03, this.A04, r6, r7, A002, this.A0A)) {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            if (clipData.getItemCount() == 1) {
                                ClipData.Item itemAt = clipData.getItemAt(0);
                                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                    try {
                                        C62572rc r4 = new C62572rc();
                                        r4.A0G = this.A0B.A0j(uri, false);
                                        C17900vP.A0Y(A022, "VoiceMessagingService/sending verified voice message (voice); jid=", AnonymousClass000.A10());
                                        this.A0C.post(new C21455AkM(this, A022, r4, 5));
                                        return;
                                    } catch (IOException e) {
                                        Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                                        return;
                                    }
                                }
                            } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                                A10 = AnonymousClass000.A10();
                                A10.append("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                                A10.append(clipData.getItemCount());
                            }
                        }
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                        boolean isEmpty = TextUtils.isEmpty(stringExtra2);
                        A10 = AnonymousClass000.A10();
                        if (isEmpty) {
                            A10.append("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                            A10.append(A022);
                            A10.append("; text=");
                            A10.append(stringExtra2);
                        } else {
                            C17900vP.A0Y(A022, "VoiceMessagingService/sending verified voice message (text); jid=", A10);
                            this.A0C.post(new C21459AkQ(this, A022, stringExtra2, 13));
                            return;
                        }
                    }
                }
                C17960vV.A07(A022);
                Uri A003 = C62952sG.A00(this.A02.A0H(A022));
                String str = AnonymousClass2WR.A00;
                Intent A0C2 = AnonymousClass1LU.A0C(this, 0);
                A0C2.setData(A003);
                A0C2.setAction(str);
                A0C2.addFlags(335544320);
                PendingIntent A004 = C1408573i.A00(this, 2, A0C2.putExtra("fromNotification", true), 0);
                C1409673t A032 = C217217d.A03(this);
                A032.A0M = "other_notifications@1";
                A032.A0L = "err";
                A032.A03 = 1;
                A032.A0G(true);
                A032.A06(4);
                A032.A06 = 0;
                A032.A0A = A004;
                A032.A0E(getString(2131896956));
                A032.A0D(getString(2131896955));
                C17880vN.A1G(A032);
                this.A05.BkR(35, A032.A05());
                return;
            }
            A10 = AnonymousClass000.A10();
            A10.append("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=");
            A10.append(stringExtra);
            obj = A10.toString();
        }
        Log.w(obj);
    }

    public void postForegroundNotification() {
        C1409673t A032 = C217217d.A03(this);
        A032.A0M = "other_notifications@1";
        A032.A0E(getString(2131895752));
        A032.A0A = C1408573i.A00(this, 1, AnonymousClass1LU.A02(this), 0);
        A032.A03 = -2;
        C17880vN.A1G(A032);
        Notification A052 = A032.A05();
        C17900vP.A0Y(A052, "VoiceMessagingService/posting assistant notif:", AnonymousClass000.A10());
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(19, A052, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        } else {
            startForeground(19, A052);
        }
    }
}
