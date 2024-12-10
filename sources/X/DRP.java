package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;

public final class DRP implements Externalizable {
    public static final long serialVersionUID = 0;
    public Collection collection;
    public final int tag;

    /* JADX WARNING: type inference failed for: r1v4, types: [X.DcQ, java.util.List, java.util.AbstractCollection, X.1JC] */
    public void readExternal(ObjectInput objectInput) {
        Collection collection2;
        C18070vi.A0d(objectInput, 0);
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    ? r1 = new AnonymousClass1JC();
                    r1.backing = new Object[readInt];
                    while (i < readInt) {
                        r1.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = AnonymousClass1ZT.A02(r1);
                } else if (b == 1) {
                    C27356DcS dcS = C27356DcS.A00;
                    C27356DcS dcS2 = new C27356DcS(new DVM(readInt));
                    while (i < readInt) {
                        dcS2.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = AnonymousClass1AO.A00(dcS2);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unsupported collection type tag: ");
                    A10.append(b);
                    throw new InvalidObjectException(C17890vO.A0c(A10, '.'));
                }
                this.collection = collection2;
                return;
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Illegal size value: ");
            A102.append(readInt);
            throw new InvalidObjectException(C17890vO.A0c(A102, '.'));
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("Unsupported flags value: ");
        A103.append(readByte);
        throw new InvalidObjectException(C17890vO.A0c(A103, '.'));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C18070vi.A0d(objectOutput, 0);
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    private final Object readResolve() {
        return this.collection;
    }

    public DRP(Collection collection2, int i) {
        this.collection = collection2;
        this.tag = i;
    }

    public DRP() {
        this(C18460wS.A00, 0);
    }
}
