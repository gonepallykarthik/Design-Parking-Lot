package repositories;

import models.Gate;
import models.GateStatus;
import models.GateType;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer, Gate> gates = new TreeMap<>();

    public GateRepository() {
        Gate g = new Gate();
        g.setGateNumber(1);
        g.setId(1);
        g.setGateType(GateType.OPEN);
        g.setStatus(GateStatus.OPEN);
        gates.put(g.getGateNumber(), g);
    }
    public Optional<Gate> findGateById(int id) {
        if(gates.containsKey(id)) {
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }
}
