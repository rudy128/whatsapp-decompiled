package com.whatsapp.writenfctag;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MY;
import X.C108955ca;
import X.C109005cf;
import X.C1408573i;
import X.C1423379b;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C19620yd;
import X.C27231Vg;
import X.C72473Md;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteNfcTagActivity extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public C27231Vg A01;
    public PendingIntent A02;
    public NfcAdapter A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(A0A);
            this.A01 = (C27231Vg) A0A.A0N.get();
        }
    }

    public WriteNfcTagActivity(int i) {
        this.A06 = false;
        C1423379b.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131898586);
        C72473Md.A17(this);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(2131886688);
        setContentView((View) textView);
        this.A05 = getIntent().getStringExtra("mime");
        this.A04 = getIntent().getStringExtra("data");
        this.A03 = NfcAdapter.getDefaultAdapter(this);
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
        A0A.putExtra("mime", (String) null);
        A0A.putExtra("data", (String) null);
        Intent addFlags = A0A.addFlags(536870912);
        int i = 0;
        C1408573i.A04(addFlags, 0);
        if (C1408573i.A02) {
            i = 33554432;
        }
        this.A02 = PendingIntent.getActivity(this, 0, addFlags, i);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (C17890vO.A1S(intent, "android.nfc.action.TAG_DISCOVERED") || C17890vO.A1S(intent, "android.nfc.action.NDEF_DISCOVERED")) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord(2, this.A05.getBytes(Charset.forName("US-ASCII")), (byte[]) null, this.A04.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef != null) {
                    ndef.connect();
                    if (!ndef.isWritable()) {
                        Log.e("writetag/failure/tag not writable");
                    } else if (ndef.getMaxSize() < length) {
                        Log.e("writetag/failure/tag too small");
                    } else {
                        ndef.writeNdefMessage(ndefMessage);
                    }
                    this.A05.A08(2131891641, 0);
                    return;
                }
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable != null) {
                    try {
                        ndefFormatable.connect();
                        ndefFormatable.format(ndefMessage);
                    } catch (IOException e) {
                        Log.e("writetag/failure/", e);
                    }
                }
                this.A05.A08(2131891641, 0);
                return;
                Log.i("writetag/success");
                this.A05.A08(2131891642, 1);
                C27231Vg r2 = this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C19620yd.A04);
                r2.A02(Uri.parse(C17880vN.A0t(A10, 2132017222)));
                Vibrator A0H = this.A08.A0H();
                C17960vV.A07(A0H);
                A0H.vibrate(75);
                finish();
            } catch (Exception e2) {
                Log.e("writetag/failure/", e2);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.A03.disableForegroundDispatch(this);
    }

    public void onResume() {
        super.onResume();
        IntentFilter[] intentFilterArr = new IntentFilter[2];
        AnonymousClass001.A1Q(new IntentFilter("android.nfc.action.TAG_DISCOVERED"), new IntentFilter("android.nfc.action.NDEF_DISCOVERED"), intentFilterArr);
        this.A03.enableForegroundDispatch(this, this.A02, intentFilterArr, (String[][]) null);
    }

    public WriteNfcTagActivity() {
        this(0);
    }
}
