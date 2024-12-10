package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.493  reason: invalid class name */
public class AnonymousClass493 extends A34 {
    public final C27191Vc A00;
    public final AnonymousClass1E7 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap bitmap;
        Context context = (Context) this.A02.get();
        byte[] bArr = null;
        if (context != null) {
            bitmap = this.A00.A04(context, this.A01, "InviteGroupParticipantsActivity.doInBackground", 0.0f, 96, false);
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
        } else {
            bitmap = null;
        }
        return new Pair(bitmap, bArr);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        byte[] bArr = (byte[]) pair.second;
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
        if (inviteGroupParticipantsActivity != null) {
            inviteGroupParticipantsActivity.A0D = bArr;
            if (bitmap == null) {
                inviteGroupParticipantsActivity.A00.setImageResource(2131231053);
            } else {
                inviteGroupParticipantsActivity.A00.setImageBitmap(bitmap);
            }
        }
    }

    public AnonymousClass493(C27191Vc r2, AnonymousClass1E7 r3, InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass3MW.A0z(inviteGroupParticipantsActivity);
        this.A01 = r3;
    }
}
