package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.5fF  reason: invalid class name and case insensitive filesystem */
public class C110295fF extends CursorAdapter {
    public final AnonymousClass1FU A00;
    public final /* synthetic */ AudioPickerActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110295fF(AnonymousClass1FU r3, AudioPickerActivity audioPickerActivity) {
        super(r3, (Cursor) null, 0);
        this.A01 = audioPickerActivity;
        this.A00 = r3;
    }

    public static C130656jn A00(Cursor cursor, C110295fF r8) {
        if (cursor == null) {
            return null;
        }
        return new C130656jn(r8.A01, cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(0), cursor.getInt(4), cursor.getInt(5));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        new AnonymousClass73R(view, this.A01, cursor.getPosition()).A04(this.A00, A00(cursor, this));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(this.A01.getLayoutInflater(), viewGroup, 2131624234);
    }
}
