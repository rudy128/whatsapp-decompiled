package X;

import com.whatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.1Dq  reason: invalid class name and case insensitive filesystem */
public class C22901Dq extends ObjectInputStream {
    public C22901Dq(InputStream inputStream) {
        super(inputStream);
    }

    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (readClassDescriptor.getName().equals("com.whatsapp.App$Me")) {
            return ObjectStreamClass.lookup(Me.class);
        }
        return readClassDescriptor;
    }
}
