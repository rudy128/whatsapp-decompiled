package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.3t3  reason: invalid class name and case insensitive filesystem */
public class C78573t3 extends C78973u1 {
    public C27201Vd A00;
    public boolean A01;
    public final ImageView A02 = AnonymousClass3MW.A0H(this, 2131433804);
    public final ImageView A03 = AnonymousClass3MW.A0H(this, 2131433805);
    public final ImageView A04;

    public Drawable getBackgroundDrawable() {
        return null;
    }

    private void A04() {
        ImageView imageView;
        int i;
        ProfilePhotoChange profilePhotoChange;
        byte[] bArr;
        Bitmap bitmap;
        C436420i r2 = (C436420i) this.A0I;
        AnonymousClass205 r6 = r2.A0v;
        if (!(!r6.A02 || r2.A00 != 6 || (profilePhotoChange = ((AnonymousClass2MP) r2).A00) == null || (bArr = profilePhotoChange.newPhoto) == null || profilePhotoChange.oldPhoto == null)) {
            AnonymousClass25P A0C = AnonymousClass204.A0C(new AnonymousClass25O(8000, 8000), bArr);
            AnonymousClass25P A0C2 = AnonymousClass204.A0C(new AnonymousClass25O(8000, 8000), profilePhotoChange.oldPhoto);
            Bitmap bitmap2 = A0C.A02;
            if (!(bitmap2 == null || (bitmap = A0C2.A02) == null)) {
                AnonymousClass1PU r22 = this.A0H;
                AnonymousClass1BI r1 = r6.A00;
                C42941yz r0 = AnonymousClass1EC.A01;
                if (r22.A03(C42941yz.A00(r1))) {
                    Bitmap A002 = C27201Vd.A00(bitmap, -2.14748365E9f, bitmap.getWidth(), true);
                    Bitmap A003 = C27201Vd.A00(bitmap2, -2.14748365E9f, bitmap2.getWidth(), true);
                    imageView = this.A03;
                    imageView.setImageBitmap(A002);
                    this.A02.setImageBitmap(A003);
                } else {
                    BF3 bf3 = new BF3(AnonymousClass000.A0Y(this), bitmap);
                    BF3 bf32 = new BF3(AnonymousClass000.A0Y(this), bitmap2);
                    bf3.A00();
                    bf32.A00();
                    imageView = this.A03;
                    imageView.setImageDrawable(bf3);
                    this.A02.setImageDrawable(bf32);
                }
                i = 0;
                imageView.setVisibility(i);
                this.A02.setVisibility(i);
                this.A04.setVisibility(i);
            }
        }
        imageView = this.A03;
        i = 8;
        imageView.setVisibility(i);
        this.A02.setVisibility(i);
        this.A04.setVisibility(i);
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            C78403sk.A01(r1, r4, this);
            C78403sk.A02(A0n, r4, A0O, this);
            C78403sk.A00(r1, r4, r2, A0O, this);
            C78403sk.A03(A0n, r4, this);
            this.A00 = BE9.A0Y(r4);
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A04();
        }
    }

    public C78573t3(Context context, C108875cR r6, C436420i r7) {
        super(context, r6, r7);
        A1M();
        ImageView A0H = AnonymousClass3MW.A0H(this, 2131427855);
        this.A04 = A0H;
        A0H.setImageDrawable(new C74743cP(C24261Jm.A00(context, 2131231785), this.A0D));
        findViewById(2131434743).setBackground(this.A09.BQF());
        A04();
    }

    public void A1u() {
        A04();
        super.A1u();
    }

    public int getCenteredLayoutId() {
        return 2131624897;
    }

    public int getIncomingLayoutId() {
        return 2131624897;
    }

    public int getOutgoingLayoutId() {
        return 2131624897;
    }
}
