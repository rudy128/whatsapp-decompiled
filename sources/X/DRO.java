package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;

public final class DRO implements Externalizable {
    public static final long serialVersionUID = 0;
    public Map map = AnonymousClass1D7.A0I();

    public void readExternal(ObjectInput objectInput) {
        C18070vi.A0d(objectInput, 0);
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                DVM dvm = new DVM(readInt);
                for (int i = 0; i < readInt; i++) {
                    dvm.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = C200610r.A05(dvm);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Illegal size value: ");
            A10.append(readInt);
            throw new InvalidObjectException(C17890vO.A0c(A10, '.'));
        }
        throw new InvalidObjectException(AnonymousClass001.A1I("Unsupported flags value: ", AnonymousClass000.A10(), readByte));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C18070vi.A0d(objectOutput, 0);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        Iterator A15 = AnonymousClass000.A15(this.map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            objectOutput.writeObject(A16.getKey());
            objectOutput.writeObject(A16.getValue());
        }
    }

    private final Object readResolve() {
        return this.map;
    }
}
