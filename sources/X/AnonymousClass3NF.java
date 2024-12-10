package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.3NF  reason: invalid class name */
public class AnonymousClass3NF extends InsetDrawable {
    public final /* synthetic */ GroupAdminPickerActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NF(Drawable drawable, GroupAdminPickerActivity groupAdminPickerActivity) {
        super(drawable, 0);
        this.A00 = groupAdminPickerActivity;
    }

    public void draw(Canvas canvas) {
    }
}
