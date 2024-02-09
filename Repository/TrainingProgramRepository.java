import java.util.List;

public interface TrainingProgramRepository {

    TrainingProgram save(TrainingProgram program);

    TrainingProgram findById(Long id);

    List<TrainingProgram> findAll();

    void delete(TrainingProgram program);

    TrainingProgram update(TrainingProgram program);
}
