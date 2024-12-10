package X;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.6VA  reason: invalid class name */
public abstract class AnonymousClass6VA {
    public static Person A00(C136826uT r2) {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(r2.A01);
        IconCompat iconCompat = r2.A00;
        if (iconCompat != null) {
            icon = iconCompat.A09();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(r2.A03).setKey(r2.A02).setBot(r2.A04).setImportant(r2.A05).build();
    }
}
