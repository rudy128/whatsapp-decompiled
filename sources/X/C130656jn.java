package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.6jn  reason: invalid class name and case insensitive filesystem */
public class C130656jn {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final /* synthetic */ AudioPickerActivity A08;

    public C130656jn(AudioPickerActivity audioPickerActivity, String str, String str2, String str3, int i, int i2, int i3) {
        int i4 = i3;
        this.A08 = audioPickerActivity;
        this.A00 = i;
        this.A02 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : str;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i4;
        int i5 = i2;
        this.A05 = DateUtils.formatElapsedTime(C17880vN.A04((long) i5));
        C18000vb r8 = audioPickerActivity.A00;
        long A072 = C108995ce.A07(audioPickerActivity.A0E, 3657);
        long j = (long) i4;
        if (j >= A072 - 60000 && j < A072) {
            i4 = (int) (j - 60000);
        }
        this.A06 = (String) C88584aA.A00(r8, (long) i4, true, false).first;
        this.A04 = C64052u8.A07(audioPickerActivity.A00, (long) Math.max(0, i5));
    }
}
