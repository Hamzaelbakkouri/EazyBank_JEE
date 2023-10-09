package SERVICE;

import com.example.eazybank_JEE.DAO.EmployeeIMPL;
import com.example.eazybank_JEE.DAO.MissionIMPL;
import com.example.eazybank_JEE.DAO.Employee;
import com.example.eazybank_JEE.DAO.Mission;
import com.example.eazybank_JEE.INTERFACES.MissionDAO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MissionService {
    public Optional<Mission> insertMission(Mission mission) {
        Optional<Mission> missionResult = Optional.empty();
        try {
            MissionDAO missiondao = new MissionIMPL();
            missionResult = missiondao.insert(mission);
            missionResult = Optional.of(missionResult.get());
        } catch (Exception e) {
            System.out.println(e + " :Not Found");
        }
        return missionResult;
    }
    public List<Map<String, String>> getAllMission() {
        List<Map<String, String>> missionResult = null;
        try {
            MissionDAO missiondao = new MissionIMPL();
            missionResult = missiondao.getAll();
        } catch (Exception e) {
            System.out.println(e + " :Not Found");
        }
        return missionResult;
    }

    public boolean deleteMission(String code) {
        int missionResult = 0;
        try {
            MissionDAO missiondao = new MissionIMPL();
            missionResult = missiondao.delete(code);
        } catch (Exception e) {
            System.out.println(e + " :Not Found");
        }
        return missionResult > 0;
    }

}
