package strategies;

import models.SlotAssignStrategyType;

public class SlotAssignStrategyFactory {
    public static SlotAssignStrategies getSlotAssignStrategyByType(SlotAssignStrategyType slotAssignStrategyType) {
        if (slotAssignStrategyType.equals(SlotAssignStrategyType.RANDOM)) {
            return new RandomSlot();
        } else if (slotAssignStrategyType.equals(SlotAssignStrategyType.NEAREST)) {
            return new NearestSlot();
        }

        return null;
    }
}
